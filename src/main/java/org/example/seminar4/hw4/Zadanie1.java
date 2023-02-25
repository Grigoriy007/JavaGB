package org.example.seminar4.hw4;

import java.util.LinkedList;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> newList1 = new LinkedList<>();
        LinkedList<Integer> newList2 = new LinkedList<>();
        LinkedList<Integer> newList3 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину списка: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Введите значение элемента " + i + ": ");
            linkedList.add(sc.nextInt());
        }

        String result1 = linkedList.toString().replace("[", "").replace("]", "")
                .replace(",", "->");
        System.out.println("Первоначальный список: " + result1);



        int size = linkedList.size();

        for (int i = size-1; i >= 0; i--) {
            int p = linkedList.get(i);
            newList1.add(p);
        }
        String result2 = newList1.toString().replace("[", "").replace("]", "")
                .replace(",", "->");

        for (int i = 0; i < size; i++) {
            int m = linkedList.get(i);
            newList2.push(m);
        }
        String result3 = newList2.toString().replace("[", "").replace("]", "")
                .replace(",", "->");

        for (int i = 0; i < size; i++) {
            int s = linkedList.pollLast();
            newList3.add(s);
        }
        String result4 = newList3.toString().replace("[", "").replace("]", "")
                .replace(",", "->");

        System.out.println("Перевёрнутый список способом № 1: " + result2);
        System.out.println("Перевёрнутый список способом № 2: " + result3);
        System.out.println("Перевёрнутый список способом № 3: " + result4);
    }

}
