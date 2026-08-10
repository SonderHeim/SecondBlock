package task2_6.task01;

public class StringAnalyzer {
    public static void main(String[] args) {
        String line = "123 - is numbers.";

        System.out.println("Строка: " + line);
        System.out.println("Длина: " + line.length());
        System.out.println("В верхнем регистре: " + line.toUpperCase());
        System.out.println("В нижнем регистре: " + line.toLowerCase());



        System.out.println("Кол-во пробелов: " + spaceCount(line));
    }

    public static int spaceCount (String line) {
        int count = 0;
        char[] array = line.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ')
                count++;
        }
        return count;
    }

    
}
