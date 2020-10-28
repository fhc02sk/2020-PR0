public class Example3 {

    public static void main(String[] args) {
        // Hier startet das Programm
        methodA();
        methodA();
        methodA();
        methodB("cloudy, 10°C");
        methodB("sunny, 15°C");
        String wetterStatusinGraz = methodC("rainy, 5°C");
        System.out.println("wetterStatusinGraz = " + wetterStatusinGraz);
    }

    public static void methodA(){
        System.out.println("Ausgabe von MethodeA");
    }

    public static void methodB(String weatherStatus){
        System.out.println("Heute ist es in Graz: " + weatherStatus);
    }

    public static void moveX(int countSteps){
        // countSteps nach vorne gehen
    }

    public static String methodC(String weatherStatus){
        String result = "Heute ist es in Graz: " + weatherStatus;
        return result;
    }
}
