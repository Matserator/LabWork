package _0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        divideByZero();
    }

    private static void divideByZero(){
        try {
            int a = 21312/0;
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
