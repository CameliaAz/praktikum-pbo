public class Tiket {
    // atribut private untuk enkapsulasi
    private String judulFilm;
    private double hargaDasar;
    private boolean statusPembayaran;

    // konstruktor
    public Tiket(String judulFilm, double hargaDasar) {
        this.judulFilm = judulFilm;
        
        // validasi harga dasar: jika kurang dari 0, set ke default 35000
        if (hargaDasar < 0) {
            this.hargaDasar = 35000;
        } else {
            this.hargaDasar = hargaDasar;
        }
        // nilai awal statuspembayaran selalu false
        this.statusPembayaran = false;
    }

    // method untuk mengubah status pembayaran menjadi true
    public void lakukanPembayaran() {
        this.statusPembayaran = true;
    }

    // getter untuk judulfilm
    public String getJudulFilm(){
        return this.judulFilm;
    };

    // setter untuk judulfilm
    public void setJudulFilm(String judulFilm) {
        this.judulFilm = judulFilm;
    }

    // getter untuk hargadasar
    public double getHargaDasar() {
        return this.hargaDasar;
    }

    // setter untuk hargadasar dengan validasi
    public void setHargaDasar(double hargaDasar) {
        if (hargaDasar < 0) {
            this.hargaDasar = 35000.0;
        } else {
            this.hargaDasar = hargaDasar;
        }
    }

    // getter untuk statuspembayaran(read-only tanpa setter)
    public boolean getStatusPembayaran() {
        return this.statusPembayaran;
    }
}
