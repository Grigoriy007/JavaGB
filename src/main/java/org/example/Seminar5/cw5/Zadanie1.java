package org.example.Seminar5.cw5;

import java.util.HashMap;
import java.util.Map;

public class Zadanie1 {
    public static void main(String[] args) {
        Map<Character, Integer> mapCh = new HashMap<>();
        String str = "qweasd qwe asdzxc zxc zxc";
        for (int i = 0; i < str.length(); i++) {
            mapCh.putIfAbsent(str.charAt(i),0);
            mapCh.put(str.charAt(i),mapCh.get(str.charAt(i))+1);
//            if (mapCh.containsKey(str.charAt(i))) {
//                mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
//            } else {
//                mapCh.put(str.charAt(i), 1);
//            }
        }
        for (Map.Entry<Character, Integer> entry : mapCh.entrySet()){
            System.out.println(entry.getKey() + " встретились " + entry.getValue() + " раз(а) ");
        }
    }
}
