package app;

public class Main {
    public static void main(String[] args) {
        double fahrenheit = 68;

        System.out.printf("Degree converter apps\n" +
                "Version: 1.1\n");

        System.out.printf("%.2f fahrenheit = %.2f celsius\n", fahrenheit, convFahrenheitToCelsius(fahrenheit));
    }

    private static double convFahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
