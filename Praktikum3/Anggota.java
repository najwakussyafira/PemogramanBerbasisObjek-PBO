package Praktikum3;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    // constructor
    public Anggota(String nomorKTP, String nama, int limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    // getter seperlunya
    public String getNama() { return nama; }
    public String getNomorKTP() { return nomorKTP; }
    public int getLimitPinjaman() { return limitPinjaman; }
    public int getJumlahPinjaman() { return jumlahPinjaman; }

    // method bisnis: pinjam
    public void pinjam(int nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal pinjaman harus lebih dari 0.");
            return;
        }
        if (jumlahPinjaman + nominal > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
            return;
        }
        jumlahPinjaman += nominal;
    }

    // method bisnis: angsur (minimal 10% dari sisa pinjaman)
    public void angsur(int nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal angsuran harus lebih dari 0.");
            return;
        }
        if (jumlahPinjaman == 0) {
            System.out.println("Tidak ada pinjaman untuk diangsur.");
            return;
        }
        int minAngsuran = (int) Math.ceil(jumlahPinjaman * 0.10); // minimal 10%
        if (nominal < minAngsuran) {
            System.out.println("Maaf, angsuran minimal 10% dari jumlah pinjaman.");
            return;
        }
        jumlahPinjaman -= nominal;
        if (jumlahPinjaman < 0) jumlahPinjaman = 0; // tidak boleh negatif
    }
}