package org.example.Seminar3.cw3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Items items = new Items("home", "italia", 3);
        Items items2 = new Items("avto", "germany", 3);
        Items items3 = new Items("laptop", "japan", 3);
        Items items4 = new Items("avto", "usa", 6);

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(items);
        itemsList.add(items2);
        itemsList.add(items3);
        itemsList.add(items4);

        System.out.println(itemsList);
        String searchName = "avto";
        Integer sumVolume = 0;
        List<String> country = new ArrayList<>();
        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getName().equals(searchName)){
//                country.add(itemsList.get(i).getContry());
                sumVolume += itemsList.get(i).getVolume();
            }
        }
        System.out.println("c = " + country);
        System.out.println("sumVolume = " + sumVolume);
    }

}