package ch02;

public class Exercise8 {
    static int i = 66;

    public static void main(String[] args) {
        Exercise8 e1 = new Exercise8();
        Exercise8 e2 = new Exercise8();
        System.out.println("e1.i = " + e1.i);
        System.out.println("e2.i = " + e2.i);
        e1.i++;
        System.out.println("e1.i++");
        System.out.println("e1.i = " + e1.i);
        System.out.println("e2.i = " + e2.i);
    }
}
