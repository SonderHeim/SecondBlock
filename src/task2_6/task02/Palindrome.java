package task2_6.task02;

public class Palindrome {
    public static void main(String[] args) {
        String line = "Was it a car or a cat I saw";

        System.out.println("Строка \"" + line + "\" " + (isPalindrome(line) ? "- палиндром." : "- не палиндром."));
    }

    public static boolean isPalindrome(String line) {
        String clearLine = line.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(clearLine);
        stringBuilder.reverse();

        return stringBuilder.toString().equals(clearLine);
    }
}