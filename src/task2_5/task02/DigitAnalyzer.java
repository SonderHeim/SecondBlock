package task2_5.task02;

public class DigitAnalyzer {

    public static void main(String[] args) {
        int number = 221122;

        DigitsStorage storage = analyzeDigits(number);
        boolean isPalindrome = isPalindrome(number);
        printResults(number, storage, isPalindrome);
    }

    public record DigitsStorage(int countOfNumbers, int summ, int maxNumber) {
    }

    public static DigitsStorage analyzeDigits(int number) {
        int summ = 0;
        int maxNumber = 0;
        int countOfNumbers = 0;

        while (number != 0) {
            countOfNumbers++;
            int lastNum = number % 10;

            if (lastNum > maxNumber) {
                maxNumber = lastNum;
            }

            summ += lastNum;
            number /= 10;
        }

        return new DigitsStorage(countOfNumbers, summ, maxNumber);
    }

    public static boolean isPalindrome(int number) {
        int countOfNumbers = 0;
        int cloneNumber = number;

        while (cloneNumber != 0) {
            countOfNumbers++;
            cloneNumber /= 10;
        }

        int tempNumber = 1;

        for (int i = 1; i < countOfNumbers; i++) {
            tempNumber *= 10;
        }

        cloneNumber = number;

        while (cloneNumber != 0) {
            if (cloneNumber / tempNumber == cloneNumber % 10) {
                cloneNumber %= tempNumber;
                cloneNumber /= 10;
                tempNumber /= 100;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void printResults(int number, DigitsStorage storage, boolean isPalindrome) {
        System.out.println("Число: " + number);
        System.out.println("Цифр: " + storage.countOfNumbers());
        System.out.println("Сумма цифр: " + storage.summ());
        System.out.println("Максимальная цифра: " + storage.maxNumber());
        System.out.println("Палиндром: " + (isPalindrome ? "Да" : "Нет"));
    }
}