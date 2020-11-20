import java.util.*;

public class Warung {
    private String namaWarung;
    private ArrayList<Barang> listBarang = new ArrayList<>();

    public Warung(String namaWarung) {
        this.namaWarung = namaWarung;
    }

    public String getNamaWarung() {
        return namaWarung;
    }

    public void addBarang(Barang barang) {
        listBarang.add(barang);
    }

    public void deleteBarang(String namaBarang) {
        listBarang.removeIf(barang -> barang.getNamaBarang().equalsIgnoreCase(namaBarang));
    }

    public void displayBarang(int pilihDisplay) {
        switch (pilihDisplay) {
            case 1:
                System.out.println("==== Makanan ====");
                for (Barang barang:listBarang) {
                    if (barang.getJenisBarang().equalsIgnoreCase("Makanan")) {
                        barang.display();
                    }
                }
                break;
            case 2:
                System.out.println("==== Sabun ====");
                for (Barang barang:listBarang) {
                    if (barang.getJenisBarang().equalsIgnoreCase("Sabun")) {
                        barang.display();
                    }
                }
                break;
            case 3:
                System.out.println("==== Minuman ====");
                for (Barang barang:listBarang) {
                    if (barang.getJenisBarang().equalsIgnoreCase("Minuman")) {
                        barang.display();
                    }
                }
                break;
            case 4:
                System.out.println("==== Barang ====");
                for (Barang barang:listBarang) {
                    barang.display();
                }
                break;
        }
    }

    public void sortirBarang(int pilihSort) {
        Comparator<Barang> compareNama = new SortNama();
        Comparator<Barang> compareJenis = new sortJenis();
        switch (pilihSort) {
            case 1:
                listBarang.sort(compareNama);
                break;
            case 2:
                listBarang.sort(compareJenis);
                break;
        }
    }
}
