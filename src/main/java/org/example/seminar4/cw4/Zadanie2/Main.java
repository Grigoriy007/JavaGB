package org.example.seminar4.cw4.Zadanie2;
import java.util.LinkedList;
import java.util.Scanner;

//2.	Построить однонаправленный список целых чисел. Найти сумму четных элементов списка.

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину списка: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Введите значение элемента " + i + ": ");
            linkedList.add(sc.nextInt());
            if (linkedList.get(i) % 2 == 0) {
                sum += linkedList.get(i);
            }


//        System.out.println(linkedList.peek());
//        System.out.println("peek: " + linkedList);
//        System.out.println(linkedList.pop());
//        System.out.println("pop: " + linkedList);
//        linkedList.addFirst(13);    //добавляет вперед
//        System.out.println("addFirst: " + linkedList);
//        linkedList.addLast(15);    //добавляет назад
//        System.out.println("addLast: " + linkedList);
//        // замены
//        linkedList.set(0,7);
//        System.out.println("add: " + linkedList);
//        // проверка на наличие элемента
//        System.out.println("contains: " + linkedList.contains(7));
//        // удаление
//        linkedList.remove(4);
//        System.out.println("remove: " + linkedList);
        }
        System.out.println(linkedList);
        sc.close();
        System.out.println(sum);
    }
}
