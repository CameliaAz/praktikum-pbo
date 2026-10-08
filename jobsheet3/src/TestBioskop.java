public class TestBioskop {
    public static void main(String[] args) {
        Tiket tiket1 = new Tiket("Avengers: Endgame", -50000);
        System.out.println("Judul Film: " + tiket1.getJudulFilm());
        System.out.println("Harga Tiket: " + tiket1.getHargaDasar());
        System.out.println("Status Lunas?: " + tiket1.getStatusPembayaran());

        System.out.println("\nMemproses Pembayaran...");
        tiket1.lakukanPembayaran();
        System.out.println("Status Lunas?: " + tiket1.getStatusPembayaran());
    }
}
