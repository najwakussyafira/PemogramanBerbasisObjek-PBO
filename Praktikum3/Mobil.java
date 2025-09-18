package Praktikum3;

public class Mobil {
    private String merek;
    private int kecepatan;

    public Mobil(String merek, int kecepatan) {
        this.merek = merek;
        this.kecepatan = kecepatan;
    }
    public String getMerek() {
        return this.merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }
    public int getKecepatan() {
        return this.kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}