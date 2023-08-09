package sets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        evenNumbers.add(8);

        System.out.println(evenNumbers);

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>(evenNumbers);
        System.out.println(numbers);

        LinkedHashSet<Integer> numbers1 = new LinkedHashSet<>();
        // add even1 using addAll
        numbers1.addAll(evenNumbers);
        System.out.println(numbers1);

        numbers1.add(10);
        System.out.println(numbers1);

        Iterator<Integer> iterator = numbers1.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(numbers1.remove(2));
        System.out.println("numbers 1 after remove object 2: " + numbers1);
        System.out.println(numbers1.removeAll(numbers1));
        System.out.println("after remove all numbers1: " + numbers1);

        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        set1.add(2);
        set1.add(4);

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(2);
        set2.add(4);
        set2.add(6);
        set2.add(8);

        set1.addAll(set2);
        System.out.println("set1: " + set1);

        LinkedHashSet<Integer> set3 = new LinkedHashSet<>();
        set3.add(2);
        set3.add(4);

        LinkedHashSet<Integer> set4 = new LinkedHashSet<>();
        set4.add(2);
        set4.add(4);
        set4.add(6);
        set4.add(8);

        set3.retainAll(set4);
        System.out.println("set 3: " + set3);

        LinkedHashSet<Integer> set5 = new LinkedHashSet<>();
        set5.add(2);
        set5.add(4);

        LinkedHashSet<Integer> set6 = new LinkedHashSet<>();
        set6.add(2);
        set6.add(4);
        set6.add(6);
        set6.add(8);

        set6.removeAll(set5);
        System.out.println("set 6: " + set6);
    }
}
