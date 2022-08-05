public class TypeDataNumber {
    public static void main(String[] args) {

        // total capacity byte type data is from -128 to 127, size 1 byte, default value 0
        byte iniByte = 100;

        // total capacity short type data is from -32,768 to 32,767, size 2 byte, default value 0
        short iniShort = 1000;

        // total capacity int type data is from -2,147,483,648 to 2,147,483,647, size 4 byte, default value 0
        int iniInteger = 100000;

        // total capacity long type data is from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807, size 8 byte, default value 0
        long iniLOng = 1000000000;
        long iniLong2 = 100000000L;

        // total capacity float type data is from 3.4e-038 to 3.4e+038, size 4 byte, default value 0.0
        float iniFloat = 10.12F;

        // total capacity double type data is from 1.7e-308 to 1.7e+308, size 8 byte, default value 0.0
        double iniDouble = 12.2434;

        // Literals Numbers
        int decimalInt = 25;
        int hexInt = 0xA132B;
        int binInt = 0b01010101;

        // Underscore, for reading purpose, so we can read it clearly
        long balance = 100_000_000_000L;
        int sum = 20_000_000;

    }
}
