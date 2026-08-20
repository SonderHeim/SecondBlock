package task2_6.task04;

public class FormattedTable {
    public static void main(String[] args) {
        String name01 = "Игорь";
        String name02 = "Вася";
        String name03 = "Коля";

        int age01 = 20;
        int age02 = 20;
        int age03 = 20;

        float averageMark01 = 4.25f;
        float averageMark02 = 4.45f;
        float averageMark03 = 4.55f;

        System.out.println("+----+------------------+------+--------+");
        System.out.println("| №  | Имя              | Воз. | Балл   |");
        System.out.println("+----+------------------+------+--------+");
        System.out.printf("%c %s  %c %-5s %12c %-2d %3c %-2.2f %3c%n", '|', 1, '|', name01, '|', age01, '|', averageMark01, '|');
        System.out.printf("%c %s  %c %-5s %12c %-2d %3c %-2.2f %3c%n", '|', 1, '|', name02, '|', age02, '|', averageMark02, '|');
        System.out.printf("%c %s  %c %-5s %12c %-2d %3c %-2.2f %3c%n", '|', 1, '|', name03, '|', age03, '|', averageMark03, '|');
        System.out.println("+----+------------------+------+--------+");
    }
}
