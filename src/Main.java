import java.util.*;

public class Main {
    static Warung warung = new Warung("Warung Bu Imas");
    static Scanner scanner = new Scanner(System.in);
    static int pilih;

    private static void add() {
        int stokBarang;
        String namaBarang, jenisBarang;
        System.out.println("Ingin Menambahkan Barang Apa?");
        System.out.println("1.Makanan\t2.Sabun\t3.Minuman");
        System.out.print("Pilih : ");
        pilih = scanner.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("Masukkan Nama Barang : ");
                namaBarang = scanner.nextLine();
                System.out.println("Masukkan Jenis Barang : ");
                jenisBarang = scanner.nextLine();
                System.out.println("Masukkan Stok Barang yang Tersedia : ");
                stokBarang = scanner.nextInt();
                System.out.println("Masukkan Jenis Makanan : ");
                String jenisMakanan = scanner.nextLine();
                System.out.println("Masukkan Rasa Makanan : ");
                String rasaMakanan = scanner.nextLine();
                warung.addBarang(new Makanan(namaBarang, stokBarang, jenisBarang, jenisMakanan, rasaMakanan));
                break;
            case 2:
                String jenisSabun;
                System.out.println("Masukkan Nama Barang : ");
                namaBarang = scanner.nextLine();
                System.out.println("Masukkan Jenis Barang : ");
                jenisBarang = scanner.nextLine();
                System.out.println("Masukkan Stok Barang yang Tersedia : ");
                stokBarang = scanner.nextInt();
                System.out.println("Jenis Sabun[1.Cair\t2.Bubuk\t3.Mandi]");
                System.out.print("Pilih");
                int pilihJenis = scanner.nextInt();
                switch (pilihJenis) {
                    case 1:
                        jenisSabun = "Cair";
                        break;
                    case 2:
                        jenisSabun = "Bubuk";
                        break;
                    case 3:
                    default:
                        jenisSabun = "Mandi";
                        break;
                }
                System.out.println("Masukkan Aroma Sabun : ");
                String aromaSabun = scanner.nextLine();
                warung.addBarang(new Sabun(namaBarang, stokBarang, jenisBarang, jenisSabun, aromaSabun));
                break;
            case 3:
                System.out.println("Masukkan Nama Barang : ");
                namaBarang = scanner.nextLine();
                System.out.println("Masukkan Jenis Barang : ");
                jenisBarang = scanner.nextLine();
                System.out.println("Masukkan Stok Barang yang Tersedia : ");
                stokBarang = scanner.nextInt();
                System.out.println("Masukkan Jenis Makanan : ");
                String jenisMinuman = scanner.nextLine();
                System.out.println("Masukkan Rasa Makanan : ");
                String rasaMinuman = scanner.nextLine();
                warung.addBarang(new Minuman(namaBarang, stokBarang, jenisBarang, jenisMinuman, rasaMinuman));
                break;
        }
    }

    private static void delete() {
        System.out.println("Masukkan Nama Barang yang ingin dihapus : ");
        String namaBarang = scanner.next();
        warung.deleteBarang(namaBarang);
    }

    private static void display() {
        char confUrut;
        System.out.println("Ingin Display Barang apa?");
        System.out.println("1.Makanan\t2.Sabun\n3.Minuman\t4.Semua");
        System.out.print("Pilih : ");
        pilih = scanner.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("Apakah Data Ingin Diurutkan?[y/t]");
                confUrut = scanner.next().charAt(0);
                if (confUrut == 'y' || confUrut == 'Y') {
                    System.out.println("Ingin Diurutkan Berdasarkan");
                    System.out.println("1.Nama\t2.Jenis");
                    System.out.print("Pilih : ");
                    int pilihUrut = scanner.nextInt();
                    switch (pilihUrut) {
                        case 1:
                            warung.sortirBarang(1);
                            warung.displayBarang(1);
                            break;
                        case 2:
                            warung.sortirBarang(2);
                            warung.displayBarang(1);
                            break;
                        default:
                            break;
                    }
                } else if (confUrut == 't' || confUrut == 'T') {
                    warung.displayBarang(1);
                }
                break;
            case 2:
                System.out.println("Apakah Data Ingin Diurutkan?[y/t]");
                confUrut = scanner.next().charAt(0);
                if (confUrut == 'y' || confUrut == 'Y') {
                    System.out.println("Ingin Diurutkan Berdasarkan");
                    System.out.println("1.Nama\t2.Jenis");
                    System.out.print("Pilih : ");
                    int pilihUrut = scanner.nextInt();
                    switch (pilihUrut) {
                        case 1:
                            warung.sortirBarang(1);
                            warung.displayBarang(2);
                            break;
                        case 2:
                            warung.sortirBarang(2);
                            warung.displayBarang(2);
                            break;
                        default:
                            break;
                    }
                } else if (confUrut == 't' || confUrut == 'T') {
                    warung.displayBarang(2);
                }
                break;
            case 3:
                System.out.println("Apakah Data Ingin Diurutkan?[y/t]");
                confUrut = scanner.next().charAt(0);
                if (confUrut == 'y' || confUrut == 'Y') {
                    System.out.println("Ingin Diurutkan Berdasarkan");
                    System.out.println("1.Nama\t2.Jenis");
                    System.out.print("Pilih : ");
                    int pilihUrut = scanner.nextInt();
                    switch (pilihUrut) {
                        case 1:
                            warung.sortirBarang(1);
                            warung.displayBarang(3);
                            break;
                        case 2:
                            warung.sortirBarang(2);
                            warung.displayBarang(3);
                            break;
                        default:
                            break;
                    }
                } else if (confUrut == 't' || confUrut == 'T') {
                    warung.displayBarang(3);
                }
                break;
            case 4:
                System.out.println("Apakah Data Ingin Diurutkan?[y/t]");
                confUrut = scanner.next().charAt(0);
                if (confUrut == 'y' || confUrut == 'Y') {
                    System.out.println("Ingin Diurutkan Berdasarkan");
                    System.out.println("1.Nama\t2.Jenis");
                    System.out.print("Pilih : ");
                    int pilihUrut = scanner.nextInt();
                    switch (pilihUrut) {
                        case 1:
                            warung.sortirBarang(1);
                            warung.displayBarang(4);
                            break;
                        case 2:
                            warung.sortirBarang(2);
                            warung.displayBarang(4);
                            break;
                        default:
                            break;
                    }
                } else if (confUrut == 't' || confUrut == 'T') {
                    warung.displayBarang(4);
                }
                break;
        }
    }

    private static void runThis() {
        do {
            System.out.println("==== " + warung.getNamaWarung() + " ====");
            System.out.println("1.Tambah Barang\t2.Display Barang\n3.Hapus Barang\t4.Exit");
            System.out.print("Pilih : ");
            pilih = scanner.nextInt();
            switch (pilih) {
                case 1:
                    add();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (true);
    }

    private static void dummyData() {
        warung.addBarang(new Makanan("Oreo", 99, "Makanan", "Snack",
                "Coklat"));
        warung.addBarang(new Makanan("Chiki", 99, "Makanan", "Snack",
                "Keju"));
        warung.addBarang(new Sabun("Lifebuoy", 99, "Sabun", "Mandi",
                "Jeruk"));
        warung.addBarang(new Sabun("Garnier", 99, "Sabun", "Cair",
                "Bengkoang"));
        warung.addBarang(new Minuman("Marimas", 80, "Minuman", "Bubuk",
                "Jeruk"));
        warung.addBarang(new Minuman("Yakult", 99, "Minuman", "Cair",
                "Biasa"));
    }

    public static void main(String[] args) {
        dummyData();
        runThis();
    }
}
