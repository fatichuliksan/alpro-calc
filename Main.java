import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Kalkulator Sederhana");
        System.out.print("Masukkan angka pertama: ");
        double a = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double b = scanner.nextDouble();

        System.out.println("Pilih operasi (1=Penjumlahan, 2=Pengurangan, 3=Perkalian, 4=Pembagian): ");
        int choice = scanner.nextInt();

        double result = 0;

        Calculator calculator = new Calculator();

        switch (choice) {
            case 1:
                result = calculator.add(a, b);
                break;
            case 2:
                result = calculator.subtract(a, b);
                break;
            case 3:
                result = Calculator.multiplication(a, b);
                break;
            case 4:
                result = Calculator.division(a, b);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        System.out.println("Hasil: " + result);

        scanner.close();
    }
}