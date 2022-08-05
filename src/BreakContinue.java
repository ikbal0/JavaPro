public class BreakContinue {
    public static void main(String[] args) {

        // Break

        var counter = 1;

        while (true){
            System.out.println("counter-" + counter);
            counter++;

            if (counter >= 10){
                break;
            }
        }

        System.out.println("Pengulangan berhenti");

        // Continue
        for (int counter1 = 1; counter1 <= 100; counter1++) {
            if(counter1 % 2 == 0){
                continue;
            }
            System.out.println("odd number - " + counter1);
        }
    }
}
