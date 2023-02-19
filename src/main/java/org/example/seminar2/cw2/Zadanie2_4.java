package org.example.seminar2.cw2;
import java.util.*;

public class Zadanie2_4 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0, 3.0, 9.0);
        Vector vector2 = new Vector(3.0, 3.0, 3.0);

        System.out.println(vector1.toString());
        System.out.println("length =" + vector1.length());
        System.out.println("scal =" + vector1.scal(vector2));
        System.out.println(vector1.vecPr(vector2));
        System.out.println(vector1.cosinus(vector2));

    }
}
