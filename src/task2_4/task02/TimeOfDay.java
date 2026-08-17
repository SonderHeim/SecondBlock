package task2_4.task02;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class TimeOfDay {

    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();

        dayType(time);
        workTime(time);
    }

    public static void dayType(LocalDateTime time) {
        if (time.getHour() == 23) {
            System.out.println("Ночь.");
        } else if (time.getHour() >= 18) {
            System.out.println("Вечер.");
        } else if (time.getHour() >= 12) {
            System.out.println("День.");
        } else if (time.getHour() >= 5) {
            System.out.println("Утро.");
        } else if (time.getHour() >= 0) {
            System.out.println("Ночь.");
        } else {
            System.out.println("Время указано неверно.");
        }
    }

    public static void workTime(LocalDateTime time) {
        if (time.getDayOfWeek().getValue() >= DayOfWeek.MONDAY.getValue() && time.getDayOfWeek().getValue() <= DayOfWeek.FRIDAY.getValue() && time.getHour() >= 9 && time.getHour() <= 18) {
            System.out.println("Сейчас рабочее время.");
        } else {
            System.out.println("Сейчас не рабочее время.");
        }
    }
}
