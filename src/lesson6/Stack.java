package lesson6;

public class Stack {
    private int stck[] = new int[20];
    private int tos;

    public Stack() {
        tos = (int) -1;
    }

    public void push(int item) {
        if (tos == stck.length)
            System.out.println("Cтeк заполнен. ");
        else
            stck[++tos] = item;
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен. ");
            return 0;
        } else
            return stck[tos--];
    }
    public boolean isEmpty(){
        return (tos ==-1);
    }
}
