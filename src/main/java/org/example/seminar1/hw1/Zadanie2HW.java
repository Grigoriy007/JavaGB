//2) Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
//Пример: 1 2 1 2 -1 1 3 1 3 -1 0
//2 -1 переход - 2 в сумму
//3 -1 переход 3 в сумму
//суммарно выведет 5

package org.example.seminar1.hw1;
import java.util.*;

public class Zadanie2HW {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 1, 2, -1,-1, 1, 3, 1, 3, -1,-3,-7, 2, -4, 0};
        System.out.println("Заданный массив: " + Arrays.toString(numbers));

        int summa = 0;
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] > 0 && numbers[i+1] < 0){
                summa += numbers[i];
            }
        }

        System.out.print("Сумма положительных элементов перед элементами с отрицательным начением равна: " + summa);


    }
}
