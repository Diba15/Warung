package Member;

public abstract class Member {
    protected String namaMember;
    protected String noTelpon;
    protected float saldoMember;
    protected String statusMember;

    public Member(String namaMember, String noTelpon, float saldoMember, String statusMember) {
        this.namaMember = namaMember;
        this.noTelpon = noTelpon;
        this.saldoMember = saldoMember;
        this.statusMember = statusMember;
    }

    public String getNamaMember() {
        return namaMember;
    }

    public String getNoTelpon() {
        return noTelpon;
    }

    public float getSaldoMember() {
        return saldoMember;
    }

    public void setSaldoMember(float saldoMember) {
        this.saldoMember = saldoMember;
    }

    public String getStatusMember() {
        return statusMember;
    }

    public void tambahSaldo(int saldo) {
        setSaldoMember(getSaldoMember() + saldo);
    }

    public void kurangSaldo(int saldo) {
        setSaldoMember(getSaldoMember() - saldo);
    }

    public abstract void displayMember();
}
