package Barang;

/**
 * Pada class ini menggunakan extends untuk menggunakan class Barang.Barang sebagai class Induk
 * Disini juga method display dirubah isinya.
 */
public class Makanan extends Barang {
    private String jenisMakanan;
    private String rasaMakanan;

    public Makanan(String namaBarang, int stokBarang, String jenisBarang, String jenisMakanan, String rasaMakanan) {
        super(namaBarang, stokBarang, jenisBarang);
        this.jenisMakanan = jenisMakanan;
        this.rasaMakanan = rasaMakanan;
    }

    public String getJenisMakanan() {
        return jenisMakanan;
    }

    public String getRasaMakanan() {
        return rasaMakanan;
    }

    @Override
    public void display() {
        System.out.println("Nama \t: " + getNamaBarang());
        System.out.println("Jenis Barang.Barang \t: " + getJenisBarang());
        System.out.println("Stok Barang.Barang \t: " + getStokBarang());
        System.out.println("------------------------------------------");
        System.out.println("Jenis Barang.Makanan \t: " + getJenisMakanan());
        System.out.println("Rasa Barang.Makanan \t: " + getRasaMakanan());
        System.out.println("==========================================");
    }
}
