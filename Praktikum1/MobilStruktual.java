package Praktikum1;

public class MobilStruktual {
    public static void main(String[] args) {
       String merek1, merek2, merek3, merek4, merek5, merek6, merek7, merek8, merek9, merek10;
       int kecepatan1, kecepatan2, kecepatan3, kecepatan4, kecepatan5, kecepatan6, kecepatan7, kecepatan8, kecepatan9, kecepatan10;
       String warna1, warna2, warna3, warna4, warna5, warna6,warna7, warna8, warna9, warna10;

        merek1 = "Toyota";
        kecepatan1 = 50; 
        warna1 = "Hitam";

        merek2 = "Honda"; 
        kecepatan2 = 40; 
        warna2 = "Putih";

        merek3 = "Suzuki"; 
        kecepatan3 = 60; 
        warna3 = "Merah";

        merek4 = "Nissan"; 
        kecepatan4 = 55; 
        warna4 = "Biru";

        merek5 = "BMW";  
        kecepatan5 = 80;
        warna5 = "Silver";

        merek6 = "Mercedes"; 
        kecepatan6 = 90; 
        warna6 = "Hitam";

        merek7 = "Mazda"; 
        kecepatan7 = 70; 
        warna7 = "Abu-abu";

        merek8 = "Daihatsu"; 
        kecepatan8 = 45; 
        warna8 = "Hijau";

        merek9 = "Ford"; 
        kecepatan9 = 65; 
        warna9 = "Kuning";

        merek10 = "Chevrolet"; 
        kecepatan10 = 75; 
        warna10 = "Biru Tua";

        kecepatan1 = tambahKecepatan(kecepatan1, 20);
        kecepatan2 = kurangiKecepatan(kecepatan2, 10);

        System.out.println("Mobil " + merek1 + " | Kecepatan sekarang: " + kecepatan1 + " | Warna: " + warna1);
        System.out.println("Mobil " + merek2 + " | Kecepatan sekarang: " + kecepatan2 + " | Warna: " + warna2);

    }
    public static int tambahKecepatan(int kecepatan, int nilai) {
        return kecepatan + nilai;
    }
    public static int kurangiKecepatan(int kecepatan, int nilai) {
        return kecepatan - nilai;
    }
}