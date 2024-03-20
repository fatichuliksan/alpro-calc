public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    // Metode perkalian
    public static double multiplication(double a, double b) {
        return a * b;
    }

    // Metode pembagian
    public static double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Pembagi tidak boleh nol.");
        }
        return a / b;
    }

}
