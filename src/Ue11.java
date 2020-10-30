public class Ue11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0 && i % 3 == 0){
                System.out.print(i + " ping pong");
            }
            else if (i % 2 == 0){
                System.out.print(i + " ping");
            }
            else if (i % 3 == 0){
                System.out.print(i + " pong");
            }
            else
                System.out.print(i + " -");

            System.out.println();// Damit ein Umbruch entsteht
        }
    }
}
