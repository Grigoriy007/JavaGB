package org.example.seminar1.cw1;
import java.util.*;


public class Zadanie5 {
    public static void main(String[] args){
        int[] myArray = {1, 2, 3, 6, 3, 2, 1};
        System.out.println(tester(myArray));
        }

    public static String tester (int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length - 1 - i]){
                return ("Не симметричный");
            }
        }
        return ("симметричный");
    }
}
