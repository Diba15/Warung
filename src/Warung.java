import Barang.Barang;
import Sort.*;

import java.util.*;

/**
 * Disini class Barang.java Melakukan Agregasi kepada class Warung
 */
public class Warung {
    private final String namaWarung;
    private final ArrayList<Barang> listBarang = new ArrayList<>();

    //----------------------------- Method For listBarang ------------------------------

    public Warung(String namaWarung) {
        this.namaWarung = namaWarung;
    }

    public String getNamaWarung() {
        return namaWarung;
    }

    public void addBarang(Barang barang) {
        listBarang.add(barang);
    }

    //Menggunakan Collection yang bernama removeIf untuk menghapus barang secara spesifik
    public void deleteBarang(String namaBarang) {
        listBarang.removeIf(barang -> barang.getNamaBarang().equalsIgnoreCase(namaBarang));
    }

    //Menggunakan input pilihDisplay untuk memilih Barang.Barang mana yang ingin ditampilkan
    public void displayBarang(int pilihDisplay) {
        switch (pilihDisplay) {
            case 1:
                System.out.println("==== Barang.Makanan ====");
                for (Barang barang : listBarang) {
                    if (barang.getJenisBarang().equalsIgnoreCase("Barang.Makanan")) {
                        barang.display();
                    }
                }
                break;
            case 2:
                System.out.println("==== Barang.Sabun ====");
                for (Barang barang : listBarang) {
                    if (barang.getJenisBarang().equalsIgnoreCase("Barang.Sabun")) {
                        barang.display();
                    }
                }
                break;
            case 3:
                System.out.println("==== Barang.Minuman ====");
                for (Barang barang : listBarang) {
                    if (barang.getJenisBarang().equalsIgnoreCase("Barang.Minuman")) {
                        barang.display();
                    }
                }
                break;
            case 4:
                System.out.println("==== Barang.Barang ====");
                for (Barang barang : listBarang) {
                    barang.display();
                }
                break;
        }
    }

    //Menggunakan pilihSort untuk Memilih ingin disortir berdasarkan apa
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
