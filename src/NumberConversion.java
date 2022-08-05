public class NumberConversion {
    public static void main(String[] args) {

        // Type data number conversion
        // Widening Casting (Automatic) byte -> short -> int -> long -> float -> double
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        // Narrowing Casting (Manual) double -> float -> long -> int -> short -> byte
        // Warning: while Narrowing conversion the value should be fit to data type target
        byte iniByte2 = (byte) iniInt;
    }
}
