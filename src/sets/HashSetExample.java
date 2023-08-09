package sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        System.out.println(numbers);

        Iterator<Integer> iterate = numbers.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }

        System.out.println(numbers.remove(300));

        System.out.println(numbers);

        System.out.println("remove all: " + numbers.removeAll(numbers));
        System.out.println("after remove all: " + numbers);

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(100);
        set1.add(200);
        set1.add(300);
        set1.add(400);
        set1.add(500);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(100);
        set2.add(200);
        set2.add(300);
        set2.add(400);
        set2.add(500);
        set2.add(500);

        set1.addAll(set2);

        System.out.println("set1 after add all set2: " + set1);

        set1.retainAll(set2);
        System.out.println("set1 after retain all set2: " + set1);

        HashSet<Integer> set3 = new HashSet<Integer>();
        set3.add(100);
        set3.add(200);
        set3.add(300);
        set3.add(400);
        set3.add(500);

        HashSet<Integer> set4 = new HashSet<Integer>();
        set4.add(100);
        set4.add(200);
        set4.add(300);
        set4.add(400);
        set4.add(500);
        set4.add(500);
        set4.add(600);

        set4.removeAll(set3);
        System.out.println("set4 after remove using set3: " + set4);
    }
}
