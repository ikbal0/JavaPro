package sets;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("D");

        System.out.println(set);
        System.out.println("is set contain E: " + set.contains("E"));
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.lower("B"));
        System.out.println(set.higher("B"));
        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());
        System.out.println("Set after poll first&last: " + set);
    }
}
