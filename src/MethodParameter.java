public class MethodParameter {
    public static void main(String[] args) {

        sayHello("Ikbal", "Yaduar", "Taupik");
        sayHello("Kamudi", "Yosa", "Irwandi");
        sayHello("Riki", "Dian", "Akmal");
    }

    static void sayHello(String firstName, String midName, String lastName){
        System.out.println("Hello " + firstName + " " + midName + " " + lastName);
    }
}
