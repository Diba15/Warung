import java.util.Comparator;

public class sortJenis implements Comparator<Barang> {

    @Override
    public int compare(Barang o1, Barang o2) {
        return o1.getJenisBarang().compareTo(o2.getJenisBarang());
    }
}
