package ch05;

public class Exercise4 {
    Exercise4() {
        System.out.println("default constructor");
    }
    Exercise4(String s) {
        System.out.println("parameter s constructor");
    }

    public static void main(String[] args) {
        new Exercise4();
        new Exercise4("test");
    }
}
