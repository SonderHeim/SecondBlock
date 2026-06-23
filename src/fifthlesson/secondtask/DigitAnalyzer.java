package fifthlesson.secondtask;

public class DigitAnalyzer {

    public static void main(String[] args) {
        int number = 2112;
        int summ = 0;
        int maxNumber = 0;
        int cloneNumber = number;
        int countOfNumbers = 0;
        boolean isPalindrome = false;

        while (cloneNumber != 0){
            countOfNumbers++;
            int lastNum = cloneNumber % 10;
            if (lastNum > maxNumber) {
                maxNumber = lastNum;
            }
            summ += lastNum;
            cloneNumber /= 10;
        }

        cloneNumber = number;

        int tempNumber = 1;

        for (int i = 1; i < countOfNumbers; i++) {
            tempNumber *= 10;
        }

        while (cloneNumber != 0){
            if (cloneNumber / tempNumber == cloneNumber % 10){
                cloneNumber %= tempNumber;
                cloneNumber /= 10;
                tempNumber /= 100;
            } else {
                break;
            }

            if (cloneNumber == 0) {
                isPalindrome = true;
            }
        }

        System.out.println("Число: " + number);
        System.out.println("Цифр: " + countOfNumbers);
        System.out.println("Сумма цифр: " + summ);
        System.out.println("Максимальная цифра: " + maxNumber);
        System.out.println("Палиндром: " + (isPalindrome ? "Да" : "Нет"));
    }
}
