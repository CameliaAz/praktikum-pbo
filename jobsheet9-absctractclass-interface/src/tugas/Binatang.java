package tugas;

public class Binatang {
    protected String nama;
    protected int jmlKaki;

    public Binatang(String nama, int jmlKaki) {
        this.nama = nama;
        this.jmlKaki = jmlKaki;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getName(){
        return this.nama;
    }

    public void setKaki(int jmlKaki){
        this.jmlKaki = jmlKaki;
    }

    public int getKaki(){
        return this.jmlKaki;
    }

    public void displayBinatang(){
        System.out.println("Nama: " +this.getName());
        System.out.println("Jumlah Kaki: " + this.getKaki());
    }
}
