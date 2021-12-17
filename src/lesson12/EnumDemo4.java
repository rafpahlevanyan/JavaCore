package lesson12;

public class EnumDemo4 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;

        System.out.println("Bce константы сортов яблок " +
                " и их порядковые значения");

        for (Apple a : Apple.values()) {
            System.out.println(a + " " + a.ordinal());
        }
        ap = Apple.REDDEL;
        ap2 = Apple.GOLDENDEL;
        ap3 = Apple.REDDEL;
        System.out.println();

        if (ap.compareTo(ap2)<0){
            System.out.println(ap + " nредшествуе " + ap2);
        }
        if (ap.compareTo(ap2)>0){
            System.out.println(ap2 + " nредшествуе " + ap);
        }
        if (ap.compareTo(ap3) == 0){
            System.out.println(ap + " равно " + ap3);
        }

        System.out.println();

        if (ap.equals(ap2)){
            System.out.println("Error");
        }
        if (ap.equals(ap3)){
            System.out.println(ap + " равно " + ap3);
        }
        if (ap == ap3){
            System.out.println(ap + " == " + ap3);
        }
    }

}
