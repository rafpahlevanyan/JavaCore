package lesson9.p2;

import lesson9.p1.Protection;

public class OtherPackage {

    OtherPackage(){
        lesson9.p1.Protection p = new Protection();
        System.out.println("кoнcтpyктop из другого пакета");

        System.out.println("n_pub = " + p.n_pub);
    }

}
