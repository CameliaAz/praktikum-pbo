package id.ac.polinema.inheritance.tugas1;

public class Pegawai {
    protected int nip;
    protected String nama;
    protected String alamat;

    public Pegawai(String nip, String nama, String alamat) {
        this.nip = Integer.parseInt(nip);
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public double getGaji(){
        return 1500000;
    }
}
