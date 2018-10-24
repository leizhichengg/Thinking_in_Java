package ch04;

import java.util.Random;

public class Exercise3 {
    static Random rand = new Random(50);

    public static void compare() {
        int i = rand.nextInt();
        int j = rand.nextInt();
        System.out.println("i = " + i + "j = " + j);
        if (i < j)
            System.out.println("i < j");
        else if (i > j)
            System.out.println("i > j");
        else
            System.out.println("i = j");
    }

    public static void main(String[] args) {
        while(true)
            compare();
    }
}
