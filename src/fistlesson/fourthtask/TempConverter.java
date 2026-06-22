package fistlesson.fourthtask;

public class TempConverter {

    public static void main(String[] args) {
        double celsiusToFahrenheit = 100.0 * 9 / 5 + 32;
        double celsiusToKelvin = 100.0 + 273.15;

        System.out.println(celsiusToFahrenheit);
        System.out.println(celsiusToKelvin);
        System.out.println();

        celsiusToFahrenheit = 0.0 * 9 / 5 + 32;
        celsiusToKelvin = 0.0 + 273.15;

        System.out.println(celsiusToFahrenheit);
        System.out.println(celsiusToKelvin);
        System.out.println();

        celsiusToFahrenheit = 37.0 * 9 / 5 + 32;
        celsiusToKelvin = 37.0 + 273.15;

        System.out.println(celsiusToFahrenheit);
        System.out.println(celsiusToKelvin);
        System.out.println();

        celsiusToFahrenheit = -40.0 * 9 / 5 + 32;
        celsiusToKelvin = -40.0 + 273.15;

        System.out.println(celsiusToFahrenheit);
        System.out.println(celsiusToKelvin);

        // Это происходит из-за потери точности при хранении десятичных дробей в двоичной системе.
    }
}