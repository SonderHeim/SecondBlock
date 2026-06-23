package fifthlesson.fourthtask;

import secondlesson.thirdtask.Main;

public class PrimeNumbers {

    public static void main(String[] args) {
        int count = 0;

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime){
                count++;
                System.out.print(i);
                System.out.print(" ");
            }
        }

        System.out.println();
        System.out.println("Всего простых чисел: " + count);
    }
}
