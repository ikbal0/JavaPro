public class MathematicsOperation {
    public static void main(String[] args) {

        int a = 100;
        int b = 10;
        int c = 9;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % c);

        // Augmented Assignments

        a += 10;
        System.out.println(a);

        a -= 10;
        System.out.println(a);

        a *= 10;
        System.out.println(a);

        a /= 10;
        System.out.println(a);

        a %= 10;
        System.out.println(a);

        // Unary Operator

        int d = 100;

        d++;

        System.out.println(d);

        d--;

        System.out.println(d);

        System.out.println(!false);

    }
}
