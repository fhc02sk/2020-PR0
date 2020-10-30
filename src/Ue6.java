public class Ue6 {
    public static void main(String[] args) {
        long zahl = 20201030;
        for (int i = 2; i <= 9; i++) {
            System.out.println(zahl + " * " + i + " = " + zahl * i);
            zahl = zahl * i;
        }

        for (int i = 2; i <= 9; i++) {
            System.out.println(zahl + " / " + i + " = " + zahl / i);
            zahl = zahl / i;
        }

        System.out.println(zahl);
    }
}
