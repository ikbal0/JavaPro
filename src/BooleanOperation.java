public class BooleanOperation {
    public static void main(String[] args) {

        var absen = 75;
        var nilai = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilai = nilai >= 75;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
    }
}
