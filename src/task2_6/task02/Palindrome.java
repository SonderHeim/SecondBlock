package task2_6.task02;

public class Palindrome {
    public static void main(String[] args) {
        String line = "Was it a car or a cat I saw";
        String clearLine = line.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(clearLine);
        stringBuilder.reverse();
        System.out.println(clearLine);
        if (stringBuilder.toString().equals(clearLine))
            System.out.println("Строка \"" + line + "\" - палиндром.");
        else
            System.out.println("Строка \"" + line + "\" - не палиндром.");
    }
}
