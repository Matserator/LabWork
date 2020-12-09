package _0909;

/* 
Исключение при работе с массивами
*/

public class Solution {
    public static void main(String[] args) {
        try {
            int[] m = new int[2];
            m[8] = 5;
        }
        catch (ArrayIndexOutOfBoundsException exception){

            exception.printStackTrace();
        }



    }
}
