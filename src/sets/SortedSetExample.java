package sets;

import java.util.Iterator;
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

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(set.contains("Australia"));
        System.out.println(set.first());
        System.out.println(set.last());

        System.out.println(set.remove("India"));
        System.out.println("after remove India: " + set);
        System.out.println(set.removeAll(set));
        System.out.println("after remove all: " + set);
    }
}