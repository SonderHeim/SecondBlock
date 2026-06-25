package thirdlesson.firsttask;

import java.util.Scanner;

public class ProfileBuilder {

    public static void main(String[] args) {
        String name, surname, country;
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите своё имя: ");
        name = scanner.nextLine();

        System.out.println("Введите свою фамилию: ");
        surname = scanner.nextLine();

        System.out.println("Введите город проживания: ");
        country = scanner.nextLine();

        System.out.println("Введите возраст: ");
        age = scanner.nextInt();
        while (age < 0 || age > 150){
            System.out.println("Некорректный возраст, введите ещё раз: ");
            age = scanner.nextInt();
        }

        System.out.println("=== Профиль ===");
        System.out.println(
                "Имя: " + name
                + "\nВозраст: " + age
                + "\nГод рождения: " + (2026 - age)
                + "\nГород: " + country
                + "\nДо пенсси (65 лет) осталось: " + (65 - age) + " лет"
        );
    }
}
