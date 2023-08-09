package sets;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetExample {
    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

    public static void main(String[] args) {
        EnumSet<Size> sizes = EnumSet.allOf(Size.class);
        System.out.println("all of size: " + sizes);
        
        EnumSet<Size> size1 = EnumSet.noneOf(Size.class);
        System.out.println("none of size: " + size1);

        EnumSet<Size> size2 = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);
        System.out.println("range of size: " + size2);

        EnumSet<Size> size3 = EnumSet.of(Size.SMALL, Size.LARGE);
        System.out.println("size of: " + size3);

        Iterator<Size> iterator = sizes.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("remove size medium: " + sizes.remove(Size.MEDIUM));
        System.out.println(sizes);
        System.out.println("remove all sizes: " + sizes.removeAll(sizes));
        System.out.println(sizes);

    }
}
