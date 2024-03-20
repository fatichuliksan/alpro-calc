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

        // switch(choice) {
        // case 1:
        // System.out.println("Hasil: " + Calculator.addition(a, b));
        // break;
        // case 2:
        // System.out.println("Hasil: " + Calculator.subtraction(a, b));
        // break;
        // case 3:
        // System.out.println("Hasil: " + Calculator.multiplication(a, b));
        // break;
        // case 4:
        // System.out.println("Hasil: " + Calculator.division(a, b));
        // break;
        // default:
        // System.out.println("Pilihan tidak valid.");
        // break;
        // }

        scanner.close();
    }
}