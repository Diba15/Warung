package Sort;

import Barang.Barang;

import java.util.Comparator;

// Implementasi Interface Java yaitu Comparator untuk membandingkan data
public class SortNama implements Comparator<Barang> {
    @Override
    public int compare(Barang o1, Barang o2) {
        return o1.getNamaBarang().compareTo(o2.getNamaBarang());
    }
}
