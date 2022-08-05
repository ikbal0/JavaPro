public class PrimitiveDataTypeConversion {
    public static void main(String[] args) {

        int age = 23;

        Integer objectAge = age;

        int ageAgain = objectAge;

        short shortAge = objectAge.shortValue();
        byte byteAge = objectAge.byteValue();
    }
}
