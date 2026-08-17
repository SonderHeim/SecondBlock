package task2_4.task04;

public class GuessGame {

    public static void main(String[] args) {
        int secret = 42;
        int guess = 15;

        guessChecker(secret, guess);
        guessChecker(secret, 35);
        guessChecker(secret, 42);
        guessChecker(secret, 50);
    }

    public static void guessChecker(int secret, int guess) {
        if (secret == guess)
            System.out.println("Угадал! Это 42.");
        else if (guess < secret)
            System.out.println("Меньше.");
        else
            System.out.println("Больше.");
    }
}
