package user;

public abstract class User {
    protected String nama;
    protected String nomorHP;
    protected String jenis;

    public User(String nama, String nomorHP, String jenis) {
        this.nama = nama;
        this.nomorHP = nomorHP;
        this.jenis = jenis;
    }

    public abstract void reservasiKamar();
}
