/*

 */
public abstract class Barang {
    protected String namaBarang,jenisBarang;
    protected int stokBarang;

    public Barang(String namaBarang, int stokBarang, String jenisBarang) {
        this.namaBarang = namaBarang;
        this.stokBarang = stokBarang;
        this.jenisBarang = jenisBarang;
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

    public abstract void display();
}
