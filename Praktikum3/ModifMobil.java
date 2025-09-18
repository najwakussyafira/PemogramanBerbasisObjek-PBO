package Praktikum3;

public class ModifMobil {
    private String merek;     
    private int kecepatan;    
    
    public ModifMobil(String merek) {
        this.merek = merek;
        this.kecepatan = 0; 
    }

    public String getMerek() {
        return merek;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan (akses internal): " + kecepatan + " km/jam");
    }
}