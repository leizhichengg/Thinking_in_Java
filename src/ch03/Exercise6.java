package ch03;

//package ch03 has class Dog
/*class Dog {
    String name;
    String says;
}*/

public class Exercise6 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "spot";
        d1.says = "Ruff!";
        Dog d2 = new Dog();
        d2.name = "scruffy";
        d2.says = "Wurf!";
        System.out.println("Dog " + d1.name + " says: " + d1.says);
        System.out.println("Dog " + d2.name + " says: " + d2.says);
        Dog d3 = new Dog();
        d3 = d1;
        System.out.println("Dog " + d2.name + " says: " + d2.says);
        System.out.println(d1 == d2);
        System.out.println(d1.equals(d2));
    }
}
