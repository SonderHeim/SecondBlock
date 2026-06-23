package fourthlesson.fouthtask;

public class GuessGame {

    public static void main(String[] args) {
        int secret = 42;
        int guess = 15;

        if (secret == guess)
            System.out.println("Угадал!");
        else if (guess < secret)
            System.out.println("Меньше.");
        else
            System.out.println("Больше.");
    }
}
