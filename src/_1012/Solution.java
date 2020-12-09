package _1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {

            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        // напишите тут ваш код
        Map<Character, Integer> map = new TreeMap<>();
        for (char i : alphabet) {
            map.put(i, 0);
        }
        char[] symbols;

        for (int i = 0; i < list.size(); i++) {
            symbols = list.get(i).toCharArray();
            for (char symbol : symbols) {
                if (alphabet.contains(symbol)) {
                    Integer qty = map.get(symbol);
                    qty++;
                    map.put(symbol, qty);
                }

            }
        }
        for (Map.Entry<Character, Integer> pair : map.entrySet()){
            System.out.println(pair.getKey() +" - "+pair.getValue());
        }
    }
}
