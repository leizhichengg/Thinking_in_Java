package ch03;

class Dog {
    String name;
    String says;
}

public class Exercise5 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "spot";
        d1.says = "Ruff!";
        Dog d2 = new Dog();
        d2.name = "scruffy";
        d2.says = "Wurf!";
        System.out.println("Dog " + d1.name + " says: " + d1.says);
        System.out.println("Dog " + d2.name + " says: " + d2.says);
    }
}
