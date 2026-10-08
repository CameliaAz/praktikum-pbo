// Nama: Camelia Azzahra
// NIM: 264107027014
// Kelas: TI 2G

public class MainPelangganRestoran {
    public static void main(String[] args){
        Restoran resto = new Restoran();
        resto.setNama("Bubur Ayam Mang Udin");
        resto.setHarga(15000);
        resto.setJarakTempuh(15.5);

        Kurir k = new Kurir();
        k.setNama("Mr. X");
        k.setTarif(6000);

        Pesanan p = new Pesanan();
        p.setKodePemesanan("A001");
        p.setJumlahPesanan(3);
        p.setRestoran(resto);
        p.setKurir(k);

        int totalPembelian = resto.hitungHargaTotal(p.getJumlahPesanan());
        int totalOngkir = k.hitungBiayaTarif(resto.getJarakTempuh());
        int grandTotal = p.hitungBiayaTotal();

        System.out.println("=== DETAIL PESANAN [" + p.getKodePemesanan() + "] ===");
        System.out.println("Restoran     : " + resto.getNama());
        System.out.println("Pesanan      : " + p.getJumlahPesanan() + " porsi @ Rp " + resto.getHarga());
        System.out.println("Total Makanan: Rp " + totalPembelian);
        System.out.println("----------------------------------------");
        System.out.println("Kurir        : " + k.getNama());
        System.out.println("Jarak        : " + resto.getJarakTempuh() + " km @ Rp " + k.getTarif() + "/km");
        System.out.println("Total Ongkir : Rp " + totalOngkir);
        System.out.println("----------------------------------------");
        System.out.println("GRAND TOTAL  : Rp " + grandTotal);

        

        

    }


}
