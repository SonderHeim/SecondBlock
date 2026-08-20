package task2_6.task03;

import java.util.ArrayList;
import java.util.List;

public class TextStats {
    public static void main(String[] args) {
        String line = "Шла Саша по шоссе и сосала сушку. Триста тридцать три.";
        ArrayList<String> strings = new ArrayList<>(List.of(line.split(" ")));

        wordNumber(strings);
        symbolNumber(line);
        longestWord(strings);
        smolestWord(strings);
        averageWordLength(strings);
    }

    public static void wordNumber(ArrayList<String> strings) {
        System.out.println("Кол-во слов в предложении: " + strings.size());
    }

    public static void symbolNumber(String line) {
        int count = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) != ' '){
                count++;
            }
        }

        System.out.println("Кол-во символов без пробелов: " + count);
    }

    public static void longestWord (ArrayList<String> strings) {
        int wordPosition = 0;
        int countSymbols = 0;

        ArrayList<String> clearStrings = clearArray(strings);

        for (int i = 0; i < clearStrings.size(); i++) {
            if (clearStrings.get(i).length() > countSymbols){
                countSymbols = clearStrings.get(i).length();
                wordPosition = i;
            }
        }

        System.out.println("Самое длинное слово в строке: " + clearStrings.get(wordPosition));
    }

    public static void smolestWord (ArrayList<String> strings) {
        int wordPosition = 0;
        int countSymbols = Integer.MAX_VALUE;

        ArrayList<String> clearStrings = clearArray(strings);

        for (int i = 0; i < clearStrings.size(); i++) {
            if (clearStrings.get(i).length() < countSymbols){
                countSymbols = clearStrings.get(i).length();
                wordPosition = i;
            }
        }

            System.out.println("Самое короткое слово в строке: " + clearStrings.get(wordPosition));
    }

    public static void averageWordLength(ArrayList<String> strings) {
        double averageLength = 0;

        ArrayList<String> clearStrings = clearArray(strings);

        for (var string : clearStrings) {
            averageLength += string.length();
        }

        averageLength /= clearStrings.size();

        System.out.printf("Средняя длина слова в предложении: %.2f", averageLength);
    }

    public static ArrayList<String> clearArray (ArrayList<String> oldArray) {
        ArrayList<String> clearStrings = (ArrayList<String>) oldArray.clone();

        for (int i = 0; i < clearStrings.size(); i++) {
            clearStrings.set(i, clearStrings.get(i).replaceAll("[.,!?]", ""));
        }

        return clearStrings;
    }
}
