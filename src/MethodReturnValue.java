public class MethodReturnValue {
    public static void main(String[] args) {
        var a = 100;
        var b = 100;
        var c = sum(a, b);

        System.out.println(c);
        System.out.println(check(100, "+", 100));
        System.out.println(check(200, "-", 100));
    }

    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    }

    static  int check(int value1, String operation, int value2){
        switch (operation){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
