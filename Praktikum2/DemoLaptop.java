package Praktikum2;
public class DemoLaptop {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop();

        laptop1.merk = "Lenovo";
        laptop1.ukuranLayar = 15.6;
        laptop1.kapasitasRAM = 16;
        laptop1.kapasitasStorage = 512;
        laptop1.statusBaterai = 80;

        laptop2.merk = "Asus";
        laptop2.ukuranLayar = 14.0;
        laptop2.kapasitasRAM = 8;
        laptop2.kapasitasStorage = 256;
        laptop2.statusBaterai = 60;

        laptop1.nyalakan();
        laptop1.jalankanAplikasi("Google Chrome");
        laptop1.cekBaterai();
        laptop1.matikan();

        System.out.println();

        laptop2.nyalakan();
        laptop2.jalankanAplikasi("Microsoft Word");
        laptop2.cekBaterai();
        laptop2.matikan();
    }
    }