/**
 * 2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */
package org.example.seminar2.hw2;

import java.util.*;

public class Zadanie2HW {
    public static void main(String[] args) {
        int size = sizeInp();
        System.out.println("Введите простые числа в последовательсности: ");
        int number1 = numInp();
        int i = 0;
        int count = 0;
        boolean controlEnd = true;
        while (controlEnd == true && i < size-1) {
            int number2 = numInp();
            if (number1 == number2) {
                count++;
            }
            controlEnd = checkUP(number1, number2, count, size);
            if (controlEnd == false) {
                System.out.println("Последовательность не является возрастающей");
            }
            i++;
            number1 = number2;
        }
        if (controlEnd == true) {
            System.out.println("Последовательность является возрастающей");
        }
    }

    /**
     * Создаю методы для проверки ввода
     * @return сли все введено верно возвращает введенное интовое значение
     */

    public static int numInp() {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Введите верное значение. Значение не может содержать " +
                    "недопустимые строчные символы, либо быть дробным числом");
            return numInp();
        } else {
            int numCont = scanner.nextInt();
            return numCont;
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


    /**
     * Создаю метод для роверки на возрастание
     * @return false если послеовательность не возрастающая или последовательность состоит из одинаковых чисел
     */

    public static boolean checkUP(int num1, int num2, int sizeCount, int sizeIn) {
        if (sizeCount == sizeIn - 1) {
            return false;
        }
        if (num1 > num2) {
            return false;
        } else {
            return true;
        }
    }

}