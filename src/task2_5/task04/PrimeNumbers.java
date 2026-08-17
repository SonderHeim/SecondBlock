package task2_5.task04;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    public static void main(String[] args) {
        NumberStorage numberStorage = simpleNumberFinder();

        for (int i = 0; i < numberStorage.simpleNumbers.size(); i++) {
            System.out.print(numberStorage.simpleNumbers.get(i) + " ");
        }
        System.out.println();
        System.out.println("Всего простых чисел: " + numberStorage.count);
    }

    public static NumberStorage simpleNumberFinder () {
        int count = 0;

        List<Integer> array = new ArrayList<>();

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
                array.add(i);
            }
        }

        return new NumberStorage(count, array);
    }

    public record NumberStorage(int count, List<Integer> simpleNumbers) {}
}
