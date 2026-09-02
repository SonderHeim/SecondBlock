package task2_6.task04;

public class FormattedTable {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Игорь", 20, 4.25f),
                new Student(2, "Вася", 20, 4.45f),
                new Student(3, "Коля", 20, 4.55f)
        };

        printTable(students);
    }

    public static void printTable(Student[] students) {
        int numberWidth = 0;
        int nameWidth = 0;

        for (Student student : students) {
            int numberLength = String.valueOf(student.number).length();

            if (numberLength > numberWidth) {
                numberWidth = numberLength;
            }

            if (student.name.length() > nameWidth) {
                nameWidth = student.name.length();
            }
        }

        printHeader(numberWidth, nameWidth);

        for (Student student : students) {
            printRow(student, numberWidth, nameWidth);
        }

        printFooter(numberWidth, nameWidth);
    }

    public static void printHeader(int numberWidth, int nameWidth) {
        printFooter(numberWidth, nameWidth);

        System.out.printf("| %-" + numberWidth + "s | %-" + nameWidth + "s | Воз. | Балл |%n",
                "№", "Имя");

        printFooter(numberWidth, nameWidth);
    }

    public static void printRow(Student student, int numberWidth, int nameWidth) {
        System.out.printf("| %-" + numberWidth + "d | %-" + nameWidth + "s | %d   | %.2f |%n",
                student.number,
                student.name,
                student.age,
                student.averageMark);
    }

    public static void printFooter(int numberWidth, int nameWidth) {
        String line = "+"
                + "-".repeat(numberWidth + 2)
                + "+"
                + "-".repeat(nameWidth + 2)
                + "+------+------+";

        System.out.println(line);
    }
}