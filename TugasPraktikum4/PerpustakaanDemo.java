package TugasPraktikum4;
import java.util.ArrayList;
public class PerpustakaanDemo {
    public static void main(String[] args) {
        Buku b1 = new Buku("BK001", "Pemrograman Berorientasi Objek");
        Buku b2 = new Buku("BK002", "Struktur Data");
        Buku b3 = new Buku("BK003", "Basis Data");

        Peminjaman p1 = new Peminjaman("PMJ-001", "2025-09-10", "2025-09-17");
        p1.tambahBuku(b1);
        p1.tambahBuku(b2);

        Peminjaman p2 = new Peminjaman("PMJ-002", "2025-09-18", "2025-09-25");
        p2.tambahBuku(b3);

        Anggota a1 = new Anggota("AG001", "Najwa Kus Syafira");
        a1.tambahPinjam(p1);
        a1.tambahPinjam(p2);
        a1.tampilPinjam();
    }
}

class Buku {
    private String kodeBuku;
    private String judul;

    public Buku(String kodeBuku, String judul) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
    }

    public String getKode() { return kodeBuku; }
    public void setKode(String kodeBuku) { this.kodeBuku = kodeBuku; }

    public String getJudul() { return judul; }
    public void setJudul(String judul) { this.judul = judul; }

    public void tampilInfo() {
        System.out.println("- [" + kodeBuku + "] " + judul);
    }
}

class Peminjaman {
    private String idPeminjaman;
    private String tanggalPinjam;
    private String tanggalKembali;
    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    public Peminjaman(String idPeminjaman, String tanggalPinjam, String tanggalKembali) {
        this.idPeminjaman = idPeminjaman;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public String getIdPeminjaman() { return idPeminjaman; }
    public void setIdPeminjaman(String idPeminjaman) { this.idPeminjaman = idPeminjaman; }

    public String getTanggalPinjam() { return tanggalPinjam; }
    public void setTanggalPinjam(String t) { this.tanggalPinjam = t; }

    public String getTanggalKembali() { return tanggalKembali; }
    public void setTanggalKembali(String t) { this.tanggalKembali = t; }

    public ArrayList<Buku> getDaftarBuku() { return daftarBuku; }

    public void tambahBuku(Buku b) {
        if (b != null) daftarBuku.add(b);
    }

    public void tampilkanInfo() {
        System.out.println("ID Peminjaman : " + idPeminjaman);
        System.out.println("Tgl Pinjam    : " + tanggalPinjam);
        System.out.println("Tgl Kembali   : " + tanggalKembali);
        System.out.println("Daftar Buku   :");
        if (daftarBuku.isEmpty()) {
            System.out.println("(belum ada buku)");
        } else {
            for (Buku b : daftarBuku) {
                b.tampilInfo();
            }
        }
    }
}

class Anggota {
    private String idAnggota;
    private String nama;
    private ArrayList<Peminjaman> daftarPinjam = new ArrayList<>();

    public Anggota(String idAnggota, String nama) {
        this.idAnggota = idAnggota;
        this.nama = nama;
    }

    public String getIdAnggota() { return idAnggota; }
    public void setIdAnggota(String idAnggota) { this.idAnggota = idAnggota; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public ArrayList<Peminjaman> getDaftarPinjam() { return daftarPinjam; }

    public void tambahPinjam(Peminjaman p) {
        if (p != null) daftarPinjam.add(p);
    }

    public void tampilPinjam() {
        System.out.println("===== Riwayat Peminjaman Anggota =====");
        System.out.println("ID Anggota : " + idAnggota);
        System.out.println("Nama       : " + nama);
        System.out.println("Jumlah peminjaman: " + daftarPinjam.size());
        System.out.println("--------------------------------------");
        if (daftarPinjam.isEmpty()) {
            System.out.println("(belum pernah meminjam)");
        } else {
            for (int i = 0; i < daftarPinjam.size(); i++) {
                System.out.println("Peminjaman ke-" + (i + 1));
                daftarPinjam.get(i).tampilkanInfo();
                System.out.println("--------------------------------------");
            }
        }
    }
}