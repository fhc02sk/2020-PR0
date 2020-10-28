public class Example6 {

    public static void main(String[] args) {

        int counter = 10;

        while (counter > 0){
            System.out.println(counter);
            counter--; // counter = counter - 1;
        }
        // sobald bedingung = false, geht's hier weiter
        System.out.println("Schleife beendet: " + counter);
        while (counter < 10){
            System.out.println(counter);
            counter++;// counter = counter + 1;
        }
        System.out.println("Schleife2 beendet: " + counter);
    }
}
