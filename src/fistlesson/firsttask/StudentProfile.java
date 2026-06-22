package fistlesson.firsttask;

public class StudentProfile {

    public static void main(String[] args) {
        byte mark = 5;
        short studentTicket = 127;
        int birthDate = 1042005;
        long phoneNumber = 79201242692L;
        float averageMark = 4.5f;
        double finalMark = 4.642;
        boolean isPayment = true;
        char firstLetterOfName = 'Д';

        System.out.println(
                "Оценка: " + mark
                + "\nНомер студенческого билета: " + studentTicket
                + "\nДата рождения: " + birthDate
                + "\nНомер телефона: " + phoneNumber
                + "\nСредняя оценка: " + averageMark
                + "\nИтоговая оценка: " + finalMark
                + "\nСтатус оплаты: " + isPayment
                + "\nПервая буква имени: " + firstLetterOfName
        );
    }
}