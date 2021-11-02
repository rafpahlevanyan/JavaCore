package lesson6;

public class Box {
    double width;
    double height;
    double depth;

    //    void volume() {
//        System.out.print("Oбъeм равен ");
//        System.out.println(width * depth * height);
//
//    }
    Box(){
        System.out.println("Koнcтpyиpoвaниe объекта Вох");
        width = 10;
        height = 10;
        depth = 10;
    }
    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
