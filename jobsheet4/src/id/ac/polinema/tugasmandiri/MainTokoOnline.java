package id.ac.polinema.tugasmandiri;

public class MainTokoOnline {
    public static void main(String[] args){
        Pesanan order1 = new Pesanan("ORDR A001", "INV-8890");

        Pelanggan pembeli = new Pelanggan("mila", "milaaacantik@gmail.com");
        order1.setPemesan(pembeli);

        Pembayaran qris = new Pembayaran("QRIS GOPAY");
        order1.prosesPembayaran(qris, 150000.0);

        System.out.println();
        order1.tampilkanDetailPemesanan();
    }

}
