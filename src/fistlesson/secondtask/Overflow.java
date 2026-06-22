package fistlesson.secondtask;

public class Overflow {

    public static void main(String[] args) {
        int integer = Integer.MAX_VALUE;

        System.out.println(++integer);

        // Примитивные типы данных имеют свои максимальные и минимальные значения, при выходе за их пределы начинается новый цикл подсчёта. Т.е. в случае с выходом за пределы в бОльшую сторону значение переключается на минимальное.

        int secondsInHundredYears = 60 * 60 * 24 * 365 * 100;

        System.out.println(secondsInHundredYears);

        long secondsInHundredYearsLongVariable = 60L * 60 * 24 * 365 * 100;

        System.out.println(secondsInHundredYearsLongVariable);

        // Тип long занимает вдвое больше байт памяти и за счёт этого позволяет хранить бОльшее значение. В случае с int нам просто не хватает диапазона значений, чтобы хранить необходимое число.
    }
}
