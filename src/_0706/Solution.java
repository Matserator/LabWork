package _0706;

import java.io.IOException;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int [] street = new int[15];
        System.out.println("type people>>");
        for (int i = 0; i < street.length; i++) {
            System.out.print("{House " + (i+1) +" } >> ");
            street[i] = GetInt();
        }
        Calculate(street);
    }

    public static void Calculate(int[] str) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < str.length; i++) {
            if(i%2==0 || i==0)
                left+=str[i];
            else
                right +=str[i];
        }
        System.out.println("left = " + left);
        System.out.println("right = "+ right);
        if (left>right)
            System.out.println("четная сторона больше чем не четная");
        else if (left<right)
            System.out.println("не четная сторона больше чем  четная");
        else
            System.out.println("поравну");

    }

    public static int GetInt(){
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }
}
