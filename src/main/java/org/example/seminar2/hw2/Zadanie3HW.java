/**
 * 3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */

package org.example.seminar2.hw2;
import java.util.*;


public class Zadanie3HW {
    public static void main(String[] args) {
        int size = sizeInp();
        System.out.println("Введите простые числа в массиве: ");
        int[] array = new int[size];
        int count = 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            array[i] = numInp();
            if((array[i] > 9 && array[i] < 100) || (array[i]  < - 9 && array[i] > -100)){
                count++;
                sum+=i;
            }

        }
        System.out.println("Задан массив: " + Arrays.toString(array));
        System.out.println("Сумма всех индексов отрицательных чисел равна: " + sum);

        for (int j = 0; j < size; j++) {
            if(array[j] < 0){
                array[j] = sum;
            }
        }

        System.out.println("Массив после замены всех отрицательных чисел: " + Arrays.toString(array));

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
        }
        else {
            int numCont = scanner.nextInt();
            return numCont;
        }
    }

    public static int sizeInp() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Длина массива: ");
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