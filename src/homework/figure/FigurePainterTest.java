package homework.figure;

public class FigurePainterTest {
    public static void main(String[] args) {
        FigurePainter fp = new FigurePainter();
        fp.figureOne(5, '?');
        fp.figureOne(12, 'o');
        fp.figureOne(24,'@');
        fp.figureTwo(7);
        fp.figureThree(10);
        fp.figureFour(15);
        fp.figureFive(20);
    }
}
