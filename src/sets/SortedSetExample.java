package sets;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        set.add("India");
        set.add("Indonesia");
        set.add("Japan");
        set.add("Australia");
        set.add("Spain");
        set.add("Australia");

        System.out.println(set);
    }
}