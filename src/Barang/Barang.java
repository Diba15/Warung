package Barang;

/**
 * Author : Dimas Bagas Saputro
 * Program Warung
 * Membuat Aplikasi Warung yang bisa menambahkan, manghapus dan menampilkan barang.
 */

//Class dibuat Abstact karena nantinya class ini dipakai untuk diwariskan kepada class anak.
public abstract class Barang {
    protected String namaBarang, jenisBarang;
    protected int stokBarang, hargaBarang;

    public Barang(String namaBarang, int stokBarang, String jenisBarang, int hargaBarang) {
        this.namaBarang = namaBarang;
        this.stokBarang = stokBarang;
        this.jenisBarang = jenisBarang;
        this.hargaBarang = hargaBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getStokBarang() {
        return stokBarang;
    }

    public void setStokBarang(int stokBarang) {
        this.stokBarang = stokBarang;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    //method yang akan diwariskan dan diubah isinya
    public abstract void display();
}
