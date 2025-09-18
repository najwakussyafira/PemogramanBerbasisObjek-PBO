package Praktikum3;

public class MainMobil {
    public static void main(String[] args) {
        Mobil m1 = new Mobil("Toyota", 80);
        m1.tampilkanInfo();

        m1.setKecepatan(100);
        System.out.println("\nSetelah diubah:");
        m1.tampilkanInfo();
    }
}
