public class Example8 {

    public static void main(String[] args) {

        // 1 ... 9
        // 50 ... 100
        // startWert ... EndWert

        /*int startWert = 2;
        int endWert = 9;
        while (startWert <= endWert){

            System.out.println(startWert);
            startWert++;
        }*/

        long zahl = 20201018;
        for (int i = 2; i <= 9; i++) {
            System.out.println(zahl + " * " + i + " = " + zahl * i);
            zahl = zahl * i;
        }

        for (int i = 2; i <= 9; i++) {
            System.out.println(zahl + " / " + i + " = " + zahl / i);
            zahl = zahl / i;
        }

        System.out.println(zahl);

        /*
        2105 * 2 = 4210
        4210 * 3 = 12630
        12630 * 4 = ....
        ...
        xx * 9 = y

        y / 2 = xx2
        y / 3 = xx3
        ...
        y / 9 = 2105
         */
    }
}
