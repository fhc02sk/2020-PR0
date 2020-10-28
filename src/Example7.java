import java.util.Scanner;

public class Example7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie eine Zahl ein: ");
        int value = scanner.nextInt();
        int counter = 2;

        System.out.println("Ihr Zahl: " + value);

        int countModuloWithZero = 0; // int = 4byte (32bit)
        boolean isPrim = true; // boolean = 1bit

        while (counter < value){
            if (value % counter == 0){
                System.out.println(value + " kann durch " + counter
                        + " ohne Rest dividiert werden");
                countModuloWithZero++;
                isPrim = false;
            }
            counter++;
        }

        if (countModuloWithZero == 0) {
            System.out.println(value + " ist eine Primzahl! (Variante 1)");
        }
        if (isPrim){
            System.out.println(value + " ist eine Primzahl! (Variante 2)");
        }
    }

}
