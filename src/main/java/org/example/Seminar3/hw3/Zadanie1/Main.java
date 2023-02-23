package org.example.Seminar3.hw3.Zadanie1;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Product product1 = new Product("flour Upper", 50, "hight");
        Product product2 = new Product("flour Upper", 65, "1st");
        Product product3 = new Product("sugar Upper", 35, "2st");
        Product product4 = new Product("apples", 100, "hight");
        Product product5 = new Product("rice Upper", 75, "1st");
        Product product6 = new Product("orange", 55, "hight");
        Product product7 = new Product("qiwi Upper", 150, "2st");
        Product product8 = new Product("tomato", 55, "1st");

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);
        productList.add(product8);

        String searchProduct = "Upper";
        List<Product> productMax = new ArrayList<>();

        for (Product product: productList) {
            if (product.getName().contains(searchProduct)){
                if(product.getSort().equals("1st") || product.getSort().equals("2st")){
                    productMax.add(product);

                    }
                }
            }


        int max = productMax.get(0).getPrice();
        String nameMax = productMax.get(0).getName();;

        for (int i = 0; i < productMax.size(); i++) {

            if (productMax.get(i).getPrice() > max) {
                max = productMax.get(i).getPrice();
                nameMax = productMax.get(i).getName();

            }
        }

        System.out.println("Наименование продукта с максимальной стоимостью: " + nameMax);
        System.out.println("Максимальная стоимоть: " + max);
        }

    }


