import java.util.Scanner;

public class Example1 {

    // psvm
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bitte geben Sie Wert für a ein");
        int a = input.nextInt();
        int b;
        System.out.println("Bitte geben Sie Wert für b ein");
        b = input.nextInt();;
        /*
        double pi = 3.1415;
        char characterA = 'A';
        boolean isPR_O = true;
        */
        int ergebnis;
        System.out.println("Der Wert von a = " + a + ", Der Wert von b = " + b);
        ergebnis = a + b;
        System.out.println(a + " + " + b + " = " + ergebnis);
        ergebnis = a - b;
        System.out.println(a + " - " + b + " = " + ergebnis);
        int ergebnisMultiplication = a * b;
        System.out.println(a + " * " + b + " = " + ergebnisMultiplication);
        ergebnis = a / b;
        System.out.println(a + " / " + b + " = " + ergebnis);
        System.out.println(a + " % " + b + " = " + (a % b));
    }
}
