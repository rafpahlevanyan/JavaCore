package lesson8;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight1 mybox1 = new BoxWeight1(10, 20, 15, 34.4);
        BoxWeight1 mybox2 = new BoxWeight1(2, 3, 4, 0.076);
        BoxWeight1 mybox3 = new BoxWeight1();
        BoxWeight1 mycube = new BoxWeight1(3,2);
        BoxWeight1 myclone = new BoxWeight1(mybox1);

        double vol;

        vol = mybox1.volume();
        System.out.println("Oбъeм mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();
        vol = mybox3.volume();
        System.out.println("Oбъeм mybox3 равен " + vol);
        System.out.println("Вес mybox3 равен " + mybox3.weight);
        System.out.println();
        vol = myclone.volume();
        System.out.println("Oбъeм myclone равен " + vol);
        System.out.println("Вес myclone равен " + myclone.weight);
        System.out.println();
        vol = mycube.volume();
        System.out.println("Oбъeм myclone равен " + vol);
        System.out.println("Вес myclone равен " + mycube.weight);


    }
}
