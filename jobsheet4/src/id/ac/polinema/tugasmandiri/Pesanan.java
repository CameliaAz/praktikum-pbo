package id.ac.polinema.tugasmandiri;

public class Pesanan {
    private String idPesanan;
    private Pelanggan pemesan;
    private Invoice invoice;

    public Pesanan(String idPesanan, String noInvoice){
        this.idPesanan = idPesanan;
        this.invoice = new Invoice(noInvoice);
    }

    public void setPemesan(Pelanggan pemesan) {
        this.pemesan = pemesan;
    }

    public void prosesPembayaran(Pembayaran bayar, double nominal){
        this.invoice.setTotalBayar(nominal);
        System.out.println("Memproses transaksi sebesar Rp " + nominal + " via " + bayar.getMetode() + "...");
    }

    public void tampilkanDetailPemesanan(){
        System.out.println("=== DETAIL PESANAN [" + idPesanan + "] ===");
        if (pemesan != null){
            System.out.println("Nama Pembeli : " + pemesan.getNama());
        } else {
            System.out.println("Nama Pembeli : Tanpa Nama");
        }
        System.out.println("No Invoice : " + invoice.getNoInvoice());
        System.out.println("Total Bayar : " + invoice.getTotalBayar());
    }
}
