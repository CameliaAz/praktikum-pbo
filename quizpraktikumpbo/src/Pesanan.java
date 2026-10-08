public class Pesanan {
    private String kodePemesanan;
    private Restoran restoran;
    private Kurir kurir;
    private int jumlahPesanan;

    public void setKodePemesanan(String kodePemesanan){
        this.kodePemesanan = kodePemesanan;
    }

    public String getKodePemesanan(){
        return kodePemesanan;
    }

    public void setRestoran(Restoran restoran){
        this.restoran = restoran;
    }

    public Restoran getRestoran(){
       return restoran;
    }

    public void setKurir(Kurir kurir){
        this.kurir = kurir;
    }

    public Kurir getKurir(){
        return kurir;
    }

    public void setJumlahPesanan(int jumlahPesanan){
        this.jumlahPesanan = jumlahPesanan;
    }

    public int getJumlahPesanan(){
        return jumlahPesanan;
    }

    public int hitungBiayaTotal() {
        int totalPembelian = restoran.hitungHargaTotal(jumlahPesanan);
        int totalOngkir = kurir.hitungBiayaTarif(restoran.getJarakTempuh());
        return totalPembelian + totalOngkir;
    }

}
