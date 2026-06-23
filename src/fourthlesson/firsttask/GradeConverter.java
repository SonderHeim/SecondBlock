package fourthlesson.firsttask;

public class GradeConverter {

    public static void main(String[] args) {
        int score = 101;

        if (score > 100) {
            System.out.println("Недопустимая оценка");
        } else if (score >= 90) {
            System.out.println("Отлично");
        } else if (score >= 70) {
            System.out.println("Хорошо");
        } else if (score >= 50) {
            System.out.println("Удовлетворительно");
        } else if (score >= 0) {
            System.out.println("Неудовлетворительно");
        } else {
            System.out.println("Недопустимая оценка");
        }

        if (score > 100 || score < 0){
            System.out.println("Недопустимая оценка");
        } else {

            score = score / 10;

            String result = switch (score) {
                case 10, 9 -> "Отлично";
                case 7, 8 -> "Хорошо";
                case 5, 6 -> "Удовлетворительно";
                case 1, 2, 3, 4, 0 -> "Неудовлетворительно";
                default -> "Недопустимая оценка";
            };

            System.out.println(result);
        }
    }
}
