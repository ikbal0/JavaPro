public class MethodVariableArgument {
    public static void main(String[] args) {

        int[] vales = {80,90,75,80,90};
        sayCongrats("Ikbal Yaduar Taupik", vales);
        sayCongrats2("Budi", vales);
        sayCongrats2("Imam", 80,90,75,80,90);
    }

    static void sayCongrats(String name, int[] values){

        int total = 0;
        for (var value : values){
            total+=value;
        }
        int finalValues = total / values.length;

        if (finalValues >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Belum Lulus");
        }
    }

    static void sayCongrats2(String name, int... values){

        int total = 0;
        for (var value : values){
            total += value;
        }
        int finalValues = total / values.length;

        if (finalValues >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Belum Lulus");
        }
    }
}
