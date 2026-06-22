package fistlesson.thirdtask;

import java.math.BigDecimal;

public class Finance {

    public static void main(String[] args) {
        double d1 = 0.1 + 0.2;

        System.out.println(d1);

        double d2 = 10.0 - 9.0 - 0.9;

        System.out.println(d2);

        BigDecimal result = new BigDecimal("0.1");
        result = result.add(new BigDecimal("0.2"));

        System.out.println(result);

        result = new BigDecimal("10.0");
        result = result.subtract(new BigDecimal("9.0")).subtract(new BigDecimal("0.9"));

        System.out.println(result);
    }
}
