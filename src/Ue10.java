public class Ue10 {
    public static void main(String[] args) {
        System.out.println("calcFaculty(0) = " + calcFaculty(0));
        System.out.println("calcFaculty(1) = " + calcFaculty(1));
        System.out.println("calcFaculty(2) = " + calcFaculty(2));
        System.out.println("calcFaculty(3) = " + calcFaculty(3));
        System.out.println("calcFaculty(6) = " + calcFaculty(6));

    }

    public static long calcFaculty(int value){

        if (value <= 1)
            return 1; // Bei einzeiligen if-Abfragen können die Klammern entfallen

        long result = 1;
        for (int i = 2; i <= value; i++) {
            result = result * i;
        }

        return result;
    }
}
