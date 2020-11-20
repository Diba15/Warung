import java.util.Comparator;

public class SortNama implements Comparator<Barang> {
    @Override
    public int compare(Barang o1, Barang o2) {
        return o1.getNamaBarang().compareTo(o2.getNamaBarang());
    }
}
