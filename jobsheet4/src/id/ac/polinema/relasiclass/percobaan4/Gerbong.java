package id.ac.polinema.relasiclass.percobaan4;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {

        if (nomor < 1 || nomor > arrayKursi.length){
            System.out.println("Error: Nomor kursi " + nomor + " tidak valid!");
            return;
        }

        if (this.arrayKursi[nomor - 1].getPenumpang() != null) {
        System.out.println("Gagal memilih kursi nomor " + nomor + 
                           ": Kursi sudah diisi oleh " + 
                           this.arrayKursi[nomor - 1].getPenumpang().getNama() + "!");
    } else {
        // 3. Jika kursi masih kosong, set penumpang baru
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        System.out.println("Berhasil mendudukkan " + penumpang.getNama() + " di kursi nomor " + nomor);
    }

}

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}
