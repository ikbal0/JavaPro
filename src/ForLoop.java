public class ForLoop {
    public static void main(String[] args) {

        var counter = 1;

        for (; counter <= 10;) {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        }

        // with init statement

        for (var counter1 = 1; counter1 <= 10;) {
            System.out.println("counter-" + counter1);

            counter1++;
        }

        // post statement

        for (var counter2 = 1; counter2 <= 10; counter2++) {
            System.out.println("counter-" + counter2);
        }
    }
}
