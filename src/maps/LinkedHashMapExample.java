package maps;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> evenNumber = new LinkedHashMap<>();
        evenNumber.put("TWO", 2);
        evenNumber.put("FOUR", 4);

        System.out.println(evenNumber);
    }
}
