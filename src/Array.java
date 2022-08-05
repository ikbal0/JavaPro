public class Array {
    public static void main(String[] args) {

        // Create Array
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Ikbal";
        stringArray[1] = "Yaduar";
        stringArray[2] = "Taupik";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Halim";

        System.out.println(stringArray[0]);

        String[] stringArray2 = new String[3];

        // Array Initializer

        int[] arrayInt = new int[] {
                10, 20, 30, 50, 40
        };

        long[] arrayLong = {
                20, 10, 15, 60L, 30, 10
        };

        System.out.println("Length " + arrayLong.length);

        // Array inside Array
        String[][] members = {
                {"Ikbal", "Yaduar", "Taupik"},
                {"Diki", "Nugraha"},
                {"Aji", "Widodo"}
        };

        String[] members1 = members[0];

        System.out.println(members1[0]);
        System.out.println(members[1][0]);
    }
}
