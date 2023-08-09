package maps;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args) {
        NavigableMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("ONE", 1);
        numbers.put("TWO", 2);
        numbers.put("THREE", 3);

        System.out.println(numbers);
        System.out.println(numbers.firstEntry());
        System.out.println(numbers.lastEntry());
        System.out.println(numbers.pollFirstEntry());
        System.out.println(numbers.pollLastEntry());
        System.out.println(numbers);
    }   
}
