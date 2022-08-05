public class IfStatement {
    public static void main(String[] args) {
        int nilai = 90;
        int absen = 87;

        if(nilai >= 90 && absen >= 90){
            System.out.println("A");
        } else if(nilai >= 80 && absen >= 80){
            System.out.println("B");
        } else if(nilai >= 75 && absen >= 75) {
            System.out.println("C");
        } else {
            System.out.println("Tidak Lulus, silahkan coba lagi");
        }
    }
}
