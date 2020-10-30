public class Ue5 {
    public static void main(String[] args) {
        isLeapYear(1900);
        isLeapYear(2000);
        isLeapYear(1996);
        isLeapYear(2002);
        isLeapYear(2004);


        isLeapYear2(1900);
        isLeapYear2(2000);
        isLeapYear2(1996);
        isLeapYear2(2002);
        isLeapYear2(2004);
    }

    public static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " ist ein Schaltjahr");
        }
    }
    public static void isLeapYear2(int year){
        if (year % 400 == 0){
            System.out.println(year + " ist ein Schaltjahr");
        }
        else if (year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " ist ein Schaltjahr");
        }
    }

}
