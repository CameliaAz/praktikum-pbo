public class Kurir {
    private String nama;
    private int tarif;

    public Kurir(){

    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setTarif(int tarif){
        this.tarif = tarif;
    }

    public int getTarif(){
        return tarif;
    }

    public int hitungBiayaTarif(double jarakTempuh){
        return (int) (jarakTempuh * tarif);
    }
}
