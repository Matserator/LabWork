package _0617;

/* 
Блокнот для новых идей
*/

public class Solution {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    private static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }

    private static class Idea {
        public static String getDescription(){
            return "abra cadabra";
        }
    }


}
