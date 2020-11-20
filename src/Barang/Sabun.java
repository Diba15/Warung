package Barang;

/**
 * Pada class ini menggunakan extends untuk menggunakan class Barang.Barang sebagai class Induk
 * Disini juga method display dirubah isinya.
 */
public class Sabun extends Barang {
    private String jenisSabun;
    private String aromaSabun;

    public Sabun(String namaBarang, int stokBarang, String jenisBarang, String jenisSabun, String aromaSabun) {
        super(namaBarang, stokBarang, jenisBarang);
        this.jenisSabun = jenisSabun;
        this.aromaSabun = aromaSabun;
    }

    public String getJenisSabun() {
        return jenisSabun;
    }

    public String getAromaSabun() {
        return aromaSabun;
    }

    @Override
    public void display() {
        System.out.println("Nama \t: " + getNamaBarang());
        System.out.println("Jenis Barang.Barang \t: " + getJenisBarang());
        System.out.println("Stok Barang.Barang \t: " + getStokBarang());
        System.out.println("------------------------------------------");
        System.out.println("Jenis Barang.Sabun \t: " + getJenisSabun());
        System.out.println("Aroma Barang.Sabun \t: " + getAromaSabun());
        System.out.println("==========================================");
    }
}
