public class Example5 {
    public static void main(String[] args) {

        boolean isCampus02 = true;
        if (isCampus02){
            System.out.println("Bin am Campus");
        }

        boolean isCoronaTimes = true;
        if (isCoronaTimes && isCampus02){
            System.out.println("Vorlesung via Teams");
        }
        else{
            System.out.println("Vorlesung auf der Wifi");
        }

        // da passiert irgendwas
        // jetzt haben wir april
        isCoronaTimes = false;
        if (isCoronaTimes == true && isCampus02 == true){
            System.out.println("Vorlesung via Teams");
        }
        else{
            System.out.println("Vorlesung auf der Wifi");
        }

        int tankfuellung = 50;
        if (tankfuellung < 10){
            System.out.println("bald leer");
        }
        else {

        }

    }
}
