package ch05;

public class Exercise9 {
    int i;
    int j;
    Exercise9(int i) {
        this.i = i;
        j = 0;
    }

    Exercise9(int i, int j) {
        this(i);
        this.j = j;
    }

    public static void main(String[] args) {
        new Exercise9(1);
        new Exercise9(1, 7);
    }
}
