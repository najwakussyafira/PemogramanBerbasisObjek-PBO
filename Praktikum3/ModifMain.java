package Praktikum3;

public class ModifMain {
     public static void main(String[] args) {
        ModifMobil m2 = new ModifMobil("Honda");
        m2.tampilkanInfo();

        m2.setKecepatan(120); 
        System.out.println("\nSetelah set kecepatan:");
        m2.tampilkanInfo();
}
}