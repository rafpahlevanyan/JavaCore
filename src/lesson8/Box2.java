package lesson8;

public class Box2 {
    private double width;
    private double height;
    private double depth;

    Box2(Box2 ob2) {
        width = ob2.width;
        height = ob2.height;
        depth = ob2.depth;
    }

    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box2(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight2 extends Box2 {
    double weight;

    BoxWeight2(BoxWeight2 ob2) {
        super(ob2);
        weight = ob2.weight;
    }

    BoxWeight2(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight2() {
        super();
        weight = -1;
    }

    BoxWeight2(double len, double m) {
        super(len);
        weight = m;
    }
}

class Shipment extends BoxWeight2 {
    double cost;

    Shipment(Shipment ob2) {
        super(ob2);
        cost = ob2.cost;
    }

    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}



