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
        System.out.println("Nama \t: "+getNamaBarang());
        System.out.println("Jenis Barang \t: "+getJenisBarang());
        System.out.println("Stok Barang \t: "+getStokBarang());
        System.out.println("------------------------------------------");
        System.out.println("Jenis Sabun \t: "+getJenisSabun());
        System.out.println("Aroma Sabun \t: "+getAromaSabun());
        System.out.println("==========================================");
    }
}
