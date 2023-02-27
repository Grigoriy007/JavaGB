package org.example.Seminar5.hw5;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        String text = ("Россия идет вперед всей планеты. Планета — это не Россия. А что нам Россия, ".toLowerCase() +
                "это родина наша, нет планеты краше. А планета наша.").toLowerCase();
        StringBuilder sb = new StringBuilder(text);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < sb.length(); i++) {
            String cont = String.valueOf(sb.charAt(i));
            if (cont.equals(".") || cont.equals("!") || cont.equals("—")
                    || cont.equals("\"") || cont.equals(",") || cont.equals(":") || cont.equals(";")) {

                sb.deleteCharAt(i);
            }
        }

        String[] newText = sb.toString().split(" ");
        Map<String, Integer> mapCh = new HashMap<>();
        boolean controlEnd = true;

        while (controlEnd) {
            System.out.print("Введите искомое слово: ");
            String searchWord = scanner.nextLine();
            int count = 0;

            for (int i = 0; i < newText.length; i++) {
                if (newText[i].equals(searchWord)) {
                    if (!mapCh.containsKey(searchWord)) {
                        mapCh.put(newText[i], 1);
                    } else mapCh.put(newText[i], mapCh.get(newText[i]) + 1);
                } else count++;

            }
            if (count == newText.length) {
                System.out.println("Слова" + "'" + searchWord + "'" + "нет в рассматривемом тексте");
            }

            controlEnd = circleAnswer();

        }


        for (var entry : mapCh.entrySet()) {
            if (!entry.getKey().equals("")) {
                System.out.println("Слово " + "'" + entry.getKey() + "'" + " встретилось: " + entry.getValue() + " раз(а)");
            }

        }

    }

    public static boolean circleAnswer() {
        System.out.print("Вы хотите попробовать найти ещё одно слово? Ответьте Да или Нет: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();
        if (text.equals("да")) {
            return true;
        } else if (text.equals("нет")) {
            return false;
        } else {
            System.out.println("Введено неверное значение");
            return circleAnswer();
        }


    }
}


