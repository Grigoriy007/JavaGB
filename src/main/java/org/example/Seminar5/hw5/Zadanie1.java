package org.example.Seminar5.hw5;
import java.util.HashMap;
import java.util.Map;

public class Zadanie1 {
    public static void main(String[] args) {
        Map<String, Integer> mapCh = new HashMap<>();
        String text = ("Россия идет вперед всей планеты. Планета — это не Россия. А что нам Россия, " +
                "это родина наша, нет планеты краше. А планета наша.").toLowerCase();
        StringBuilder sb = new StringBuilder(text);

        for (int i = 0; i < sb.length(); i++) {
            String cont = String.valueOf(sb.charAt(i));
            if (cont.equals(".") || cont.equals("!") || cont.equals("—")
                    || cont.equals("\"") || cont.equals(",") || cont.equals(":") || cont.equals(";")){

                sb.deleteCharAt(i);
            }
        }

        String[]newText = sb.toString().split(" ");

        for (int i = 0; i < newText.length; i++) {
            if (!mapCh.containsKey(newText[i])) {
                mapCh.put(newText[i], 1);
            } else {
                mapCh.put(newText[i], mapCh.get(newText[i]) + 1);
            }

        }
        for (var entry : mapCh.entrySet()) {
            if (!entry.getKey().equals("")){
                System.out.println("Слово " + "'" + entry.getKey() + "'" + " встретилось: " + entry.getValue() + " раз(а)");
            }

        }

    }


}
