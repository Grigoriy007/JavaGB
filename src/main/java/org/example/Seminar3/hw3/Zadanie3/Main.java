package org.example.Seminar3.hw3.Zadanie3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Books book1 = new Books("Война и мир", "Толстой", 150, 1908, 367);
        Books book2 = new Books("Кошки", "Застольный", 200, 2001, 360);
        Books book3 = new Books("Герри", "Амарин", 300, 2022, 271);
        Books book4 = new Books("Жора", "Акинчев", 300, 2022, 277);
        Books book5 = new Books("Крыжовник", "Попятный", 230, 2000, 320);
        Books book6 = new Books("Как ловить медуз", "АСпанчБобСквепенс", 300, 2019, 1129);
        Books book7 = new Books("Тор", "Один", 300, 2021, 173);
        Books book8 = new Books("Тор", "Лакки", 300, 2009, 181);

        List<Books> booksList = new ArrayList<Books>();
        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);
        booksList.add(book6);
        booksList.add(book7);
        booksList.add(book8);

        System.out.println("Названия книг по заданным параметрам: ");;
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).getYear() >= 2010 && booksList.get(i).getAuthor().contains("А")) {
                int number = booksList.get(i).getPages();
                int count = 0;
                for (int j = 1; j <= number; j++) {
                    if (number % j == 0) {
                        count += 1;
                    }
                }
                if (count == 2) {
                    System.out.println(booksList.get(i).getName());
                }


            }
        }

    }

}