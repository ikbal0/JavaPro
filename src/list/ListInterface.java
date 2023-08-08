package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        List<String> arrayList = new ArrayList<>();
        List<String> vector = new Vector<>();

        System.out.println("vector size: " + vector.size());
        
        vector.add("programmer");
        vector.add("networking");
        vector.add("database");
        vector.add("deployment");
        vector.add("cloud services");

        System.out.println(vector);

        System.out.println("vector size after: " + vector.size());

        vector.remove(0);
        
        System.out.println("vector size after remove index 0: " + vector.size());

        vector.clear();

        System.out.println("vector size after clear: " + vector.size());

        arrayList.add("Leon");
        arrayList.add("Sheila");
        arrayList.add("Sarah");

        linkedList.add("Java");
        linkedList.add("Golang");
        linkedList.add("C#");

        System.out.println("arrayList: " + arrayList);

        arrayList.remove(1);

        for(String value: arrayList) {
            System.out.println(value);
        }

        System.out.println("linkedList: " + linkedList);

        linkedList.add(0, "C++");

        for(String value: linkedList) {
            System.out.println(value);
        }
    }
}
