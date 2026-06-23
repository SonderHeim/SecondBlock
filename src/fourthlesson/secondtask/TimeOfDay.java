package fourthlesson.secondtask;

public class TimeOfDay {

    public static void main(String[] args) {
        int time = 16, day = 4;

        if (time > 23) {
            System.out.println("Время указано неверно.");
        } else if (time == 23) {
            System.out.println("Ночь.");
        } else if (time >= 18) {
            System.out.println("Вечер.");
        } else if (time >= 12) {
            System.out.println("День.");
        } else if (time >= 5) {
            System.out.println("Утро.");
        } else if (time >= 0) {
            System.out.println("Ночь.");
        } else {
            System.out.println("Время указано неверно.");
        }

        if (day > 0 && day < 6 && time >= 9 && time <= 18){
            System.out.println("Сейчас рабочее время.");
        } else {
            System.out.println("Сейчас не рабочее время.");
        }
    }
}
