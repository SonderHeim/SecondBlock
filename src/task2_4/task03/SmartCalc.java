package task2_4.task03;

public class SmartCalc {

    public static void main(String[] args) {
        var firstNum = 5;
        var secondNum = 0;
        char operation = '+';

        calculate(firstNum, secondNum, operation);
    }

    public static void calculate(int firstNum, int secondNum, char operation) {
        var result = switch (operation) {
            case '+' -> firstNum + secondNum;
            case '-' -> firstNum - secondNum;
            case '*' -> firstNum * secondNum;
            case '/' -> {
                if (secondNum == 0)
                    throw new ArithmeticException("Делить на ноль нельзя!");
                yield firstNum / secondNum;
            }
            case '%' -> {
                if (secondNum == 0)
                    throw new ArithmeticException("Брать остаток от деления на ноль нельзя!");
                yield firstNum % secondNum;
            }
            default -> throw new IllegalArgumentException("Неизвестная операция");
        };

        System.out.println(result);
    }
}
