public class Example4 {
    public static void main(String[] args) {

        double km = 12.71;

        System.out.println("Kilometer: " + km);

        // Methodenaufruf
        double miles;
        miles = km2miles(km);
        System.out.println("km = " + km + " umgerechnet in Meilen sind: " + miles);

        double km_neu = miles2km(miles);
        System.out.println("miles = " + miles + " umgerechnet in Kilometer sind: " + km_neu);

        System.out.println("miles = " + miles + " umgerechnet in Kilometer sind: "
                + miles2km(miles));

    }

    public static double km2miles(double kmA){
        double erg = kmA / 1.6;
        return erg;
    }

    public static double miles2km(double miles){
        return (miles * 1.6);
    }
}
