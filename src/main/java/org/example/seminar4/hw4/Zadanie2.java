package org.example.seminar4.hw4;
import java.util.*;

public class Zadanie2 {
    public static void main(String[] args) {
        String zadanie = "(){}[]";
        if(!checkSymb(zadanie)) System.out.println("Содержатся симовлы не отвечающие условям задачи");
        else System.out.println("Все симолы закрываются");

    }



    public static boolean checkSymb(String s){
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '{' || c == '(' || c == '['){
                stk.push(c);
            }
            else if(!stk.empty()) {
                if ((c == ']' && stk.peek() == '[') ||(c == '}' && stk.peek() == '{') || (c == ')' && stk.peek() == '(')){
                    stk.pop();
                }
                else stk.push(c);
            }
            else stk.push(c);


        }
        if(stk.empty()) return true;
        else return false;
    }

}