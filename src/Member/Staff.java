package Member;

public class Staff extends Member {
    private String password;

    public Staff(String namaMember, String noTelpon, float saldoMember, String statusMember) {
        super(namaMember, noTelpon, saldoMember, statusMember);
        password = "staff";
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void displayMember() {
        System.out.println("Nama \t: "+getNamaMember());
        System.out.println("No Telpon \t: "+getNoTelpon());
        System.out.println("Saldo \t: "+getSaldoMember());
        System.out.println("Status \t: "+getStatusMember());
    }
}
