package Praktikum2;

public class Laptop {
    public String merk;
    public double ukuranLayar;
    public int kapasitasRAM;
    public int kapasitasStorage;
    public int statusBaterai;   

    public void nyalakan() {
        System.out.println(merk + " dinyalakan.");
    }
    public void matikan() {
        System.out.println(merk + " dimatikan.");

    }
    public void jalankanAplikasi(String namaAplikasi) {
        if (statusBaterai > 0) {
            System.out.println("Menjalankan aplikasi: " + namaAplikasi);
            statusBaterai -= 10; 
            if (statusBaterai < 0) statusBaterai = 0;
        } else {
            System.out.println("Baterai habis! Tidak bisa menjalankan aplikasi.");
        }
    }

    public int cekBaterai() {
        System.out.println("Sisa baterai: " + statusBaterai + "%");
        return statusBaterai;
    }
}