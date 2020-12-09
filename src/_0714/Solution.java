package _0714;

/*
Слова в обратном порядке
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("input 5 words >>");
        for (int i = 0; i < 5; i++) {
            list.add(new Scanner(System.in).nextLine());
        }
        list.remove(3);

        for (int i = list.size()-1; i >= 0; i--) {
             System.out.println( list.get(i));
        }
    }
}
