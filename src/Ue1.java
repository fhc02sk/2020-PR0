public class Ue1 {

    public static void main(String[] args) {
        System.out.println("Ausgabe auf der Console");

        int counter = 1;
        while (counter <= 100) {
            System.out.println("Durchlauf: " + counter);
            counter++;
        }

        for (int i = 1; i <= 100; i++) {
            System.out.println("Durchlauf mit for: " + i);
        }
    }

}
