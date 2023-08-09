package maps;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> evenNumber = new LinkedHashMap<>();
        evenNumber.put("TWO", 2);
        evenNumber.put("FOUR", 4);

        System.out.println(evenNumber);

        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>(evenNumber);
        numbers.put("SIX", 6);

        System.out.println(numbers);

        numbers.putIfAbsent("SIX", 6);
        numbers.putIfAbsent("EIGHT", 8);

        System.out.println(numbers);
    }
}
