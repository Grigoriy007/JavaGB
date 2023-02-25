package org.example.seminar4.cw4;
import java.util.Deque;
import java.util.LinkedList;

public class Zadanie5 {

    public static void main(String[] args) {

        String text = ".//.";
        System.out.println(simplifyPath(text));
    }


    public static String simplifyPath (String path) {
        Deque<String> list = new LinkedList<>();
        String[] arr = path.split("/");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("") || arr[i].equals(".")) continue;
            else if (arr[i].equals("..")) {
                if (!list.isEmpty()) list.pollLast();
            }else list.add(arr[i]);
        }
        return "/" + String.join("/", list);
    }
}
