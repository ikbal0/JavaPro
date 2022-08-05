public class TernaryOperator {
    public static void main(String[] args) {

        // without ternary operator
        Integer nilai = 75;
        String ucapan;

        if(nilai >= 75) {
            ucapan = "C";
        } else {
            ucapan = "not found";
        }

        System.out.println(ucapan);

        // dengan ternary operator
        var nila2 = 75;
        String ucapan2 = nila2 >= 75 ? "Selamat anda lulus!" : "Silahkan coba lagi";

        System.out.println(ucapan2);
    }
}
