package org.example.Seminar6.cw6.Zadanie4;

public class Main {
    public static void main(String[] args) {
        double temp = 37.0;
        System.out.println("Фаренгейты: " + new Fahrenheit().convertValue(temp));
        System.out.println("Цельсии: " + new Celsius().convertValue(temp));
        System.out.println("Келвин: " + new Kelvin().convertValue(temp));
        System.out.println("Рейнура: " + new Renura().convertValue(temp));
    }
}
