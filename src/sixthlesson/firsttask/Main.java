package sixthlesson.firsttask;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String text = "hello  buddy my friend", email = "yandex@ya.ru", word = "А роза упала на лапу Азора";
        System.out.println(countWords(text));
        System.out.println(isValidEmail(email));
        System.out.println(isPalindrome(word));
    }

    public static int countWords (String text){
        int count;

        String[] array = text.trim().split("\\s+");
        count = array.length;

        return count;
    }

    public static boolean isValidEmail(String email){
        boolean isValid = false;

        if (email.indexOf("@") == email.lastIndexOf("@") && email.indexOf("@") < email.lastIndexOf(".") && email.indexOf("@") > 0 && !email.contains(" ")){
            isValid = true;
        }

        return isValid;
    }

    public static boolean isPalindrome(String word){
        word = word.toLowerCase().replace(" ", "");

        int left = 0, right = word.length() - 1;

        while (left < right){
            if (word.charAt(right) != word.charAt(left)){
                return false;
            }
            right--;
            left++;
        }

        return true;
    }
}
