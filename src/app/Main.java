package app;

public class Main {
    public static void main(String[] args) {
        double fahrenheit = 68;
        double celsius = 20;

        System.out.printf("Degree converter apps\n" +
                "Version: 1.2\n");

        System.out.printf("%.2f fahrenheit = %.2f celsius\n", fahrenheit, convFahrenheitToCelsius(fahrenheit));
        System.out.printf("%.2f celsius = %.2f fahrenheit \n", celsius, convCelsiusToFahrenheit(celsius));
    }

    private static double convFahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    private static double convCelsiusToFahrenheit(double celsius){
        return celsius * 9.0 / 5.0 + 32;
    }
}
