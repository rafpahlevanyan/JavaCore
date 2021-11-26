package lesson8;

public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Trinagle t = new Trinagle(10, 8);
        Figure figuref;
        figuref = r;
        System.out.println("Плoщaдь равна " + figuref.area());
        figuref = t;
        System.out.println("Плoщaдь равна " + figuref.area());
        figuref = f;
        System.out.println("Плoщaдь равна " + figuref.area());
    }
}
