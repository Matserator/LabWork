package _0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        Cat[]cats = new Cat[10];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
            System.out.println(cats[i].toString());
        }

    }

    public static class Cat {
        private static int count = 0;
        private int countTemp;
        Cat(){
            countTemp = count++;
        }

        @Override
        public String toString() {
            return "Cat{"+ countTemp +'}';
        }
    }
}
