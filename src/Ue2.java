public class Ue2 {
    public static void main(String[] args) {
        int counter = 100;
        while (counter > 0) {
            System.out.println("Durchlauf: " + counter);
            counter--;
        }

        for (int i = 100; i >= 1; i--) {
            System.out.println("Durchlauf mit for: " + i);
        }
    }

}
