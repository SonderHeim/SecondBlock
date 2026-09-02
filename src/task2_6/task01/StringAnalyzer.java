package task2_6.task01;

public class StringAnalyzer {
    public static void main(String[] args) {
        String line = " 123 - is numbers. World.";

        printResults(line);
    }

    public static void printResults(String line) {
        System.out.println("Строка: " + line);
        System.out.println("Длина: " + line.length());
        System.out.println("В верхнем регистре: " + line.toUpperCase());
        System.out.println("В нижнем регистре: " + line.toLowerCase());
        withoutSpaces(line);
        spaceCount(line);
        countOfLetters(line);
        countOfDigits(line);
        isContainWorld(line);
        firstAndLastO(line);
        substringZeroFive(line);
        worldToJava(line);
    }

    public static void spaceCount(String line) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ')
                count++;
        }
        System.out.println("Кол-во пробелов: " + count);
    }

    public static void withoutSpaces(String line) {
        System.out.println("Без пробелов по краям: " + line.trim());
    }

    public static void countOfLetters(String line) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isLetter(line.charAt(i))) {
                count++;
            }
        }
        System.out.println("Количество букв: " + count);
    }

    public static void countOfDigits(String line) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i))) {
                count++;
            }
        }
        System.out.println("Количество цифр: " + count);
    }

    public static void isContainWorld(String line) {
        if (line.contains("World")) {
            System.out.println("Содержит слово \"World\": Да");
        } else {
            System.out.println("Содержит слово \"World\": Нет");
        }
    }

    public static void firstAndLastO(String line) {
        if (line.indexOf('o') == -1) {
            System.out.println("В строке нет букв o");
        } else {
            System.out.println("Первое вхождение \"o\": индекс " + line.indexOf('o'));
            System.out.println("Последнее вхождение \"o\": индекс " + line.lastIndexOf('o'));
        }
    }

    public static void substringZeroFive(String line) {
        System.out.println("Подстрока [0, 5]: " + line.substring(0, 5));
    }

    public static void worldToJava(String line) {
        System.out.println("После замены \"World\" на \"Java\": " + line.replace("World", "Java"));
    }
}
