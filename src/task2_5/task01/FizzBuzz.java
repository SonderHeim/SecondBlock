package task2_5.task01;

public class FizzBuzz {

    public static void main(String[] args) {
        int topNumber = 100;

        fizzBuzzPrinter(topNumber);
    }

    public static void fizzBuzzPrinter(int topNumber) {
        for (int i = 0; i <= topNumber; i++) {
            if (i % 5 == 0 && i % 3 == 0)
                System.out.print("FizzBuzz");
            else if (i % 3 == 0)
                System.out.print("Fizz");
            else if (i % 5 == 0)
                System.out.print("Buzz");
            else
                System.out.print(i);
            if (i != 100)
                System.out.print(", ");
        }
    }
}