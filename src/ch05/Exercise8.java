package ch05;

public class Exercise8 {
    public void a() {
        b();
        this.b();
    }

    public void b() {
        System.out.println("call b");
    }

    public static void main(String[] args) {
        new Exercise8().a();
    }
}
