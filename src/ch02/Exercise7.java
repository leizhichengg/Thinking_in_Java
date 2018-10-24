package ch02;

class StaticTest{
    static int i = 47;
}

public class Exercise7 {
    static void increment() {
        StaticTest.i++;
    }
    public static void main(String[] args) {
        Exercise7 e = new Exercise7();
        e.increment();
        Exercise7.increment();
        System.out.println(StaticTest.i);
    }
}
