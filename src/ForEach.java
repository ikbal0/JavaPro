public class ForEach {
    public static void main(String[] args) {

        // without for each
        String[] array = {
            "Budi", "Ridwan", "Kamal", "Riki", "Idan", "Reza"
        };

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //with for each

        for(var name : array) {
            System.out.println(name);
        }
    }
}
