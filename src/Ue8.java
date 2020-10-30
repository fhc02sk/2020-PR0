public class Ue8 {
    public static void main(String[] args) {

        for (int i = 0; i <= 9 ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " "); // Print ohne "ln" macht keinen Umbruch
            }
            System.out.println(); // damit ein Zeilenumbruch entsteht
        }
    }
}
