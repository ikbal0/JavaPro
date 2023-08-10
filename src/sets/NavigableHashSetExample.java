package sets;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableHashSetExample {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);

        NavigableSet<Integer> reversedSet = set.descendingSet();

        System.out.println("set: " + set);
        System.out.println("reversedSet: " + reversedSet);

        NavigableSet<Integer> threeOrMoreSet = set.tailSet(3, true);

        System.out.println("set whit value greater than 3: " + threeOrMoreSet);
        System.out.println("set lower than thirty whit .lower(30) methods: " + set.lower(30));

        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());
        System.out.println(set);
        System.out.println(set.first());
    }
}
