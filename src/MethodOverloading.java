public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Ikbal Yaduar Taupik");
        sayHello("Riza", "Kusuma");
    }

    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String fullName){
        System.out.println("Hello " + fullName);
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
