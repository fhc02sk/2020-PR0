public class Example2 {

    public static void main(String[] args) {
        String text = "Juhu, heute ist PRO0! :-)";
        System.out.println(text + ". Das macht mir natürlich Spaß");

        String text2 = null;
        System.out.println(text2);

        String text3 = "null";
        System.out.println(text3);
      //  text3 = text3.replace("l", "x");
      //  System.out.println(text3);


        int intValue = 0;
        System.out.println("intValue = " + intValue); // soutv
        {
            int intValueA = 3;
            int intValueB = 3;
            System.out.println(intValueA);
        }
        int intValueA = 5;
        System.out.println(intValueA);
        {
            int intValueB = 9;
        }

        System.out.println("intValueA = " + intValueA);
        intValueA = intValueA + 1;
        System.out.println("intValueA = " + intValueA);
        intValueA++; // intValueA = intValueA + 1;
        System.out.println("intValueA = " + intValueA);
        System.out.println("intValueA++ = " + intValueA++); // 8
        System.out.println("++intValueA = " + ++intValueA); // 8 + 1
        System.out.println("intValueA = " + intValueA);

    }
}
