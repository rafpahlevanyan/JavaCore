package lesson7;

public class OverloadDemo1 {
    void test(){
        System.out.println("Пapaмeтpы отсутствуют");
    }
    void test(int a, int b){
        System.out.println("a & b: " + a + " " + b);

    }
    double test(double a) {
        System.out.println("Bнyтpeннee преобразование при вызове " +
                 "test(double) а " + a);
        return a*a;

    }

}

