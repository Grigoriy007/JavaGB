package org.example.Seminar3.hw3.Zadanie2;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Product product1 = new Product("orange", "Italia", 2.65, 120,"1st");
        Product product2 = new Product("apple", "Indonesia", 3.25, 150,"2st");
        Product product3 = new Product("cheese", "Switzerland", 1.77, 120,"1st");
        Product product4 = new Product("oil", "Greece", 0.68, 429,"1st");
        Product product5 = new Product("nuts", "Oman", 5.31, 120,"1st");
        Product product6 = new Product("spices", "Turkey", 3.33, 2987,"High");
        Product product7 = new Product("corn", "Belarus", 7.95, 110,"Low");


        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);


        String searchProduct = "1st";
        List<Product> productMin = new ArrayList<>();

        for (Product product: productList) {
            if (product.getSort().equals(searchProduct)){
                productMin.add(product);
                }
            }

        int min = productMin.get(0).getPrice();
        StringBuilder nameMin = new StringBuilder();

        for (int i = 0; i < productMin.size(); i++) {
            if (productMin.get(i).getPrice() < min) {
                min = productMin.get(i).getPrice();
            }
        }

        for (int i = 0; i < productMin.size(); i++) {
            if (productMin.get(i).getPrice() == min) {
                nameMin.append(productMin.get(i).getName()).append(", ");
            }
        }

        System.out.println("Наименование продуктов с минимальной стоимостью - " + min + " rub: " + nameMin);
    }

}

