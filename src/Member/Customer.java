package Member;
import Barang.Barang;
import java.util.ArrayList;

public class Customer extends Member {
    private ArrayList<Barang> listPesanan = new ArrayList<>();

    public Customer(String namaMember, String noTelpon, float saldoMember, String statusMember) {
        super(namaMember, noTelpon, saldoMember, statusMember);
    }

    public void displayPesanan() {
        System.out.println("List Pesanan : ");
        for (Barang barang:listPesanan) {
            System.out.println("Nama \t: "+barang.getNamaBarang());
            System.out.println("Harga \t: "+barang.getHargaBarang());
        }
        System.out.println("Total Harga : "+getTotal());
    }

    public void beliBarang(Barang barang) {
        listPesanan.add(barang);
    }

    public int getTotal() {
        int total = 0;
        for (Barang barang:listPesanan) {
            total += barang.getHargaBarang();
        }
        return total;
    }

    @Override
    public void displayMember() {
        System.out.println("Nama \t: "+getNamaMember());
        System.out.println("No Telpon \t: "+getNoTelpon());
        System.out.println("Saldo \t: "+getSaldoMember());
        System.out.println("Status \t: "+getStatusMember());
    }
}
