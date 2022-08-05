public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai){
            case "A":
                System.out.println("Wow,Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda Lulus");
                break;
            case "D":
                System.out.println("Anda Tidak Luls");
                break;
            default:
                System.out.println("Anda mungkin salah jurusan");
        }

        // switch lambda
        var nilai2 = "G";

        switch (nilai2) {
            case "A" -> System.out.println("Wow,Anda lulus dengan baik");
            case "B", "C" -> System.out.println("Anda Lulus");
            case "D" -> System.out.println("Anda Tidak Luls");
            default -> {
                System.out.println("Anda mungkin salah jurusan");
                System.out.println("but don't be sad wkwkwkwk");
            }
        }

        // Key word Yield

        // switch without yield
        String nilai3 = "G";
        String ucapan;

        switch (nilai3) {
            case "A" -> ucapan = "Wow,Anda lulus dengan baik";
            case "B", "C" -> ucapan = "Anda Lulus";
            case "D" -> ucapan = "Anda Tidak Luls";
            default -> {
                ucapan = "Anda mungkin salah jurusan";
                System.out.println("don't be sad wkwkwkwk");
            }
        }

        System.out.println(ucapan);

        // switch with yield
        String nilai4 = "H";

        String yieldUcpan;

        yieldUcpan = switch (nilai4) {
            case "A":
                yield "Wow,Anda lulus dengan baik";
            case "B", "C":
                yield "Anda Lulus";
            case "D":
                yield "Anda Tidak Luls";
            default:
                yield "Anda mungkin salah jurusan";
        };

        System.out.println(yieldUcpan);
    }
}
