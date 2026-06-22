package secondlesson.firsttask;

public class Calculator {

    public static void main(String[] args) {
        int a = 17;
        int b = 5;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("---------------------------------");
        System.out.println("Сложение: " + a + " + " + b + " = " + (a + b));
        System.out.println("Вычитание: " + a + " - " + b + " = " + (a - b));
        System.out.println("Умножение: " + a + " * " + b + " = " + (a * b));
        System.out.println("Целое деление: " + a + " / " + b + " = " + (a / b));
        System.out.println("Остаток: " + a + " % " + b + " = " + (a % b));
        System.out.println("Вещественное: " + a + " / " + b + " = " + ((double) a / b));
        System.out.println("---------------------------------");
    }
}
