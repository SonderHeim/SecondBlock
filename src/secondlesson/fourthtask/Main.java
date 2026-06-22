package secondlesson.fourthtask;

public class Main {

    public static void main(String[] args) {
        int x = 10, y = 20, z = 10;
        boolean r1 = x == z;
        boolean r2 = x != y;
        boolean r3 = x < y && y > z;
        boolean r4 = x > y || x == z;
        boolean r5 = !(x == y) && (y >= 20);
        boolean r6 = x == 10 || 1 / 0 > 0;

        // r1 = true;
        // r2 = true;
        // r3 = true;
        // r4 = true;
        // r5 = true;
        // r6 = true; Ошибки не присходит, потому что после хотя бы одного значения true в операциях с логическим ИЛИ дальнейшие условия не проверяются.

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
    }
}
