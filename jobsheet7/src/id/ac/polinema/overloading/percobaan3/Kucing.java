package id.ac.polinema.overloading.percobaan3;

public class Kucing {
    private String nama;
    private int umur;

    public Kucing(){
        this("Tanpa Nama");
        System.out.println("Konstruktor 0 parameter selesai");
    }

    public Kucing(String nama){
        this(nama, 1);
        System.out.println("Konstruktor parameter 1 selesai");
    }

    public Kucing(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
        System.out.println("Konstruktor parameter 2 selesai");
    }

    public void info(){
        System.out.println("Kucing " +nama+ " umur " +umur+ " tahun" );
    }
}
