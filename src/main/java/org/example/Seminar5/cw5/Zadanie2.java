package org.example.Seminar5.cw5;

import java.util.HashMap;
import java.util.Map;

public class Zadanie2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(isDouble(arr));
    }
    public static boolean isDouble (int [] array){
        Map<Integer, Integer> mapList = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (mapList.containsKey(array[i])) return false;
            else mapList.put(array[i], 1);
        }
        return true;
    }

}
