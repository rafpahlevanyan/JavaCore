package lesson6;

public class Box1 {
    double width;
    double height;
    double depth;

    Box1(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }
}
