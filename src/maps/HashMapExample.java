package maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "King Charles");
        map.put(101, "Lu Quan");
        map.put(102, "Fujiwara Satoshi");
        map.put(103, "Cecilia");

        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        System.out.println(map.get(101));

        System.out.println(map.keySet());

        System.out.println(map.values());

        System.out.println(map.entrySet());

        System.out.println(map.remove(101));

        System.out.println(map.values());

        map.clear();

        System.out.println(map);
    }
}
