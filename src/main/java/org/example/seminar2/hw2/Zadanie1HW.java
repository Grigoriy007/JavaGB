/**
 * 1) Дана последовательность N целых чисел. Найти сумму простых чисел.
 */

package org.example.seminar2.hw2;

import java.util.*;

public class Zadanie1HW {
    public static void main(String[] args) {
        int size = sizeInp();
        System.out.println("Введите простые числа в последовательсности: ");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            int num = numInp();
            int count = 0;
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                sum += num;
            }

        }
        System.out.println("Сумма всех простых чисел равна: " + sum);
    }


    /**
     * Создаю методы для проверки ввода
     * @return сли все введено верно возвращает введенное интовое значение
     */

    public static int numInp() {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Введите верное значение. Значение не может содержать " +
                    "недопустимые строчные символы. либо быть дробным числом");
            return numInp();
        } else {
            int numCont = scanner.nextInt();
            if (numCont <= 0) {
                System.out.println("Введите верное значение. Целое число не может равняться 0, " +
                        " или быть отрицательным значением");
                return numInp();
            } else {
                return numCont;
            }
        }
    }


    public static int sizeInp() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Длина последовательности: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Введите верное значение. Значение длины не может содержать недопустимые строчные " +
                    "символы, либо быть дробным числом");
            return sizeInp();
        } else {
            int sizeCont = scanner.nextInt();
            if (sizeCont <= 0) {
                System.out.println("Введите верное значение. Значение длины не может равняться 0 либо быть отрицательным значением");
                return sizeInp();
            } else {
                return sizeCont;
            }
        }
    }

}
