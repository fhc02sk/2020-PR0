public class Ue7 {

    public static void main(String[] args) {

        System.out.println("isWinterreifenPflicht(10, true) = " + isWinterreifenPflicht(10, true));
        System.out.println("isWinterreifenPflicht(-1, false) = " + isWinterreifenPflicht(-1, false));
        System.out.println("isWinterreifenPflicht(6, false) = " + isWinterreifenPflicht(6, false));
        System.out.println("isWinterreifenPflicht(6, true) = " + isWinterreifenPflicht(6, true));

        System.out.println("isWinterreifenPflicht2(10, true) = " + isWinterreifenPflicht2(10, true));
        System.out.println("isWinterreifenPflicht2(-1, false) = " + isWinterreifenPflicht2(-1, false));
        System.out.println("isWinterreifenPflicht2(6, false) = " + isWinterreifenPflicht2(6, false));
        System.out.println("isWinterreifenPflicht2(6, true) = " + isWinterreifenPflicht2(6, true));

    }

    public static boolean isWinterreifenPflicht(int temperatur,
                                                boolean schneeFahrbahn) {

        if (temperatur < 0){
            return true;    // return beendet die Methode, daher muss im Anschluss kein else-if sein
        }
        if (temperatur < 8 && schneeFahrbahn) {
            return true;
        }
        return false;
    }
    public static boolean isWinterreifenPflicht2(int temperatur,
                                                boolean schneeFahrbahn) {

        if ((temperatur < 0) || (temperatur < 8 && schneeFahrbahn)){
            return true;    // return beendet die Methode, daher muss im Anschluss kein else-if sein
        }
        return false;
    }
}
