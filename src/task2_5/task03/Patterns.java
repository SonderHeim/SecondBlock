package task2_5.task03;

public class Patterns {

    public static void main(String[] args) {
        int n = 5;

        pattern01(n);
        pattern02(n);
        pattern03(n);

    }

    public static void pattern01(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
                if (j != n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern02(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                if (j + 1 != i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern03(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                if (j != i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
