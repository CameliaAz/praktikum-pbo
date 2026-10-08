package id.ac.polinema.inheritance.tugas1;

public class Dosen extends Pegawai {
    private int jumlahSKS;
    protected static final int TARIF_SKS = 100000;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int jumlahSKS){
        this.jumlahSKS = jumlahSKS;
    }
    
    @Override 
    public double getGaji() {
        return super.getGaji() + (TARIF_SKS * jumlahSKS);
    }
}
