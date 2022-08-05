import java.util.Date;

public class ExpressionStatementBlock { // { to } is a block
    public static void main(String[] args) { // this is the same { to } also block

        // Expression

        int value; // int value; is Expression
        value = 10; // value = 10; is an Expression

        System.out.println(value = 100); // System.out.println(); is an Expression and value = 100 is also expression

        // Statement
        int value1; // int value; is not only an Expression but also a Statement
        value1 = 10; // value = 10; is also Expression and statement

        // System.out.println(); is an Expression and value = 100 is also expression and the two of expression is statement
        System.out.println(value1 = 100);

        // assignment statement
        double aValue = 8993.234;

        // increment statement
        aValue++;

        // method invocation statement
        System.out.println("Hello World!");

        // object creation statement
        Date date = new Date();

    }
}
