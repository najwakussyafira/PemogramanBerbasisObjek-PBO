package Praktikum2;

public class DemoPersegi {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();

        pp.panjang = 20;
        pp.lebar = 5;

        pp.displayInfo();
        System.out.println("Luas persegi panjang: " + pp.getLuas());
        System.out.println("Keliling persegi panjang: " + pp.getKeliling());
    }
    }