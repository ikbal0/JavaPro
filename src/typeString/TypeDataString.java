package typeString;

public class TypeDataString {
    public static void main(String[] args) {
        // type data string default value is null
        String firstName = "Ikbal";
        String middleName = "Yaduar";
        String lastName = "Taupik";
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println(fullName);

        // get len
        System.out.println(fullName.charAt(0));
        // immutable String (Can't be changed)
        // Mutable String (Can be changed)

        // string buffer
        StringBuilder buffer1 = new StringBuilder("Hello");

        System.out.println("capacity of " + buffer1 + " is " + buffer1.capacity());
        buffer1.append(" World");
        
        System.out.println("capacity of " + buffer1 + " is " + buffer1.capacity());
        System.out.println(buffer1);
    }
}