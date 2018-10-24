package ch02;

public class Exercise6 {
    int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        Exercise6 e = new Exercise6();
        String s = "Hello, World";
        System.out.println("storage: " + e.storage(s));
    }
}
