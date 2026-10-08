public class Kontainer {
    // Deklarasi atribut private (Enkapsulasi)
    private String nomorResi;
    private String namaPemilik;
    private int kapasitasMaksimal;
    private int beratMuatanSaatIni;

    // Konstruktor
    public Kontainer(String nomorResi, String namaPemilik, int kapasitasMaksimal) {
        this.nomorResi = nomorResi;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.beratMuatanSaatIni = 0; // Saat dibuat, kontainer diasumsikan kosong
    }

    // Method Getter
    public String getNamaPemilik() {
        return namaPemilik;
    }

    public int getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public int getBeratMuatanSaatIni() {
        return beratMuatanSaatIni;
    }

    // Method untuk menambah muatan dengan validasi kapasitas maksimal
    public void tambahMuatan(int beratTambahan) {
        if ((this.beratMuatanSaatIni + beratTambahan) > this.kapasitasMaksimal) {
            System.out.println("[GAGAL] Penambahan muatan dibatalkan. Total muatan melebihi batas kapasitas maksimal!");
        } else {
            this.beratMuatanSaatIni += beratTambahan;
            System.out.println("[SUKSES] Barang berhasil dimasukkan.");
        }
    }

    // Method untuk menurunkan muatan dengan validasi agar tidak minus
    public void turunkanMuatan(int beratDiturunkan) {
        if ((this.beratMuatanSaatIni - beratDiturunkan) < 0) {
            System.out.println("[GAGAL] Pembongkaran dibatalkan. Jumlah yang diturunkan lebih besar dari isi muatan!");
        } else {
            this.beratMuatanSaatIni -= beratDiturunkan;
            System.out.println("[SUKSES] Barang berhasil diturunkan/dibongkar.");
        }
    }
}