package Barang;

/**
 * Pada class ini menggunakan extends untuk menggunakan class Barang.Barang sebagai class Induk
 * Disini juga method display dirubah isinya.
 */
public class Minuman extends Barang {
    private String jenisMinuman;
    private String rasaMinuman;

    public Minuman(String namaBarang, int stokBarang, String jenisBarang, String jenisMinuman, String rasaMinuman) {
        super(namaBarang, stokBarang, jenisBarang);
        this.jenisMinuman = jenisMinuman;
        this.rasaMinuman = rasaMinuman;
    }

    public String getJenisMinuman() {
        return jenisMinuman;
    }

    public String getRasaMinuman() {
        return rasaMinuman;
    }

    @Override
    public void display() {
        System.out.println("Nama \t: " + getNamaBarang());
        System.out.println("Jenis Barang.Barang \t: " + getJenisBarang());
        System.out.println("Stok Barang.Barang \t: " + getStokBarang());
        System.out.println("------------------------------------------");
        System.out.println("Jenis Barang.Minuman \t: " + getJenisMinuman());
        System.out.println("Rasa Barang.Minuman \t: " + getRasaMinuman());
        System.out.println("==========================================");
    }
}
