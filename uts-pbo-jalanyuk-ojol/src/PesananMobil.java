public class PesananMobil extends Pesanan{
    private int kursi;
    public static final int BIAYA_LAYANAN = 3000;

    public PesananMobil(String id, String namaPenumpang, double jarakKm, int kursi){
        super(id, namaPenumpang, jarakKm);
        this.kursi = kursi;
    }

    @Override
    public int hitungTarif(){
        int tarifDasar = super.hitungTarif();
        return tarifDasar + BIAYA_LAYANAN;
    }

    @Override 
    public String info(){
        return super.info() + "[Mobil, " + kursi + " kursi]";
    }

    public int getKursi(){
        return kursi;
    }

}
