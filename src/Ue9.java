public class Ue9 {
    public static void main(String[] args) {

        System.out.println("calcInterests(1000, 2) = " + calcInterests(1000, 2));
        System.out.println("calcInterests(1000, 1,75) = " + calcInterests(1000, 1.75));
    }

    public static double calcInterests(double balance, double interest){
        
        return balance * (1 + interest / 100.0);
    }
}
