public class Customer {
    private String nama, noTelpon;
    private float saldo;

    public Customer(String nama, String noTelpon, float saldo) {
        this.nama = nama;
        this.noTelpon = noTelpon;
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelpon() {
        return noTelpon;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void display() {
        System.out.println("Nama \t: "+getNama());
        System.out.println("No Telpon \t: "+getNoTelpon());
        System.out.println("Saldo \t: "+getSaldo());
        System.out.println("---------------------------------------");
    }
}
