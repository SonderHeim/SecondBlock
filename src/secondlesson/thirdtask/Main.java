package secondlesson.thirdtask;

public class Main {

    public static void main(String[] args) {
        int a = 11;
        int b = 13;

        System.out.println("Было: a = " + a + " b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Стало: a = " + a + " b = " + b);

        System.out.println("\nБыло: a = " + a + " b = " + b);

        a += b;
        b = a - b;
        a -= b;

        System.out.println("Стало: a = " + a + " b = " + b);
    }
}
