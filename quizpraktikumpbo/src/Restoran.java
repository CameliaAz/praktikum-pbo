public class Restoran {
    private String nama;
    private double jarakTempuh;
    private int harga;

    public Restoran(){

    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setJarakTempuh(double jarakTempuh){
        this.jarakTempuh = jarakTempuh;
    }

    public double getJarakTempuh(){
        return jarakTempuh;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public int getHarga(){
        return harga;
    }

    public int hitungHargaTotal(int jumlah){
        return harga * jumlah;
    }



}
