package fourthlesson.thirdtask;

public class SmartCalc {

    public static void main(String[] args) {
        var firstNum = 5;
        var secondNum = 0;
        char operation = '+';

        var result = switch (operation) {
            case '+' -> firstNum + secondNum;
            case '-' -> firstNum - secondNum;
            case '*' -> firstNum * secondNum;
            case '/' -> {
                if (secondNum == 0)
                    throw new ArithmeticException("Делить на ноль нельзя!");
                yield firstNum / secondNum;
            }
            case '%' -> firstNum % secondNum;
            default -> throw new IllegalArgumentException("Неизвестная операция");
        };

        System.out.println(result);
    }
}
