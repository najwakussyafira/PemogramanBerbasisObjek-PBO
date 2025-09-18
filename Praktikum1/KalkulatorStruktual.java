package Praktikum1;

import java.util.Scanner;

public class KalkulatorStruktual {
    public static double tambah(double a, double b) {
        return a + b;
    }
    public static double kurang(double a, double b) {
        return a - b;
    }
    public static double kali(double a, double b) {
        return a * b;
    }
    public static double bagi(double a, double b) {
        return a / b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        double hasil;

        if (operator == '+') {
            hasil = tambah(angka1, angka2);
        } else if (operator == '-') {
            hasil = kurang(angka1, angka2);
        } else if (operator == '*') {
            hasil = kali(angka1, angka2);
        } else if (operator == '/') {
            if (angka2 == 0) {
                System.out.println("Error: tidak bisa dibagi dengan nol!");
                return;
            }
            hasil = bagi(angka1, angka2);
        } else {
            System.out.println("Operator tidak dikenali.");
            return;
        }
        System.out.println("Hasil: " + hasil);
    }
}