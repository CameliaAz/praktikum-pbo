public class Main {
    public static void main(String[] args) {
        Driver budi = new Driver("Budi", 2500);
        Driver sari = new Driver("Sari", 4000);
        Promo hemat = new Promo("HEMAT20", 20);

        PesananMotor p1 = new PesananMotor("P-001", "Dina", 3.0);
        p1.tugaskan(budi);
        System.out.println(p1.info());
        System.out.println("Tarif P-001: " + p1.hitungTarif());
        System.out.println("P-001 dengan promo: " + p1.hitungTotal(hemat));
        p1.tugaskan(sari);                        // ganti driver
        System.out.println("P-001 ganti driver, dengan promo: " + p1.hitungTotal(hemat));

        PesananMobil p2 = new PesananMobil("P-002", "Raka", 10.5, 4);
        p2.tugaskan(sari);
        System.out.println(p2.info());
        System.out.println("P-002 tanpa promo: " + p2.hitungTotal(null));
    }
}

//  Tim ingin menambah jenis pesanan baru, PesananBajaj, yang tarifnya
// dikurangi 10% dari tarif dasar bila jarak ≤ 3 km. Jawab dalam maksimal 3 kalimat: bagian
// Pesanan apa yang Anda pakai ulang dan bagaimana caranya, method mana yang Anda
// override, dan mengapa rumus tarif tidak disalin dari Pesanan.
// Tulis jawaban sebagai komentar
// (diawali //) di bagian paling bawah Main.java, setelah kurung kurawal penutup kelas.
// Jawab: 
// Kelas PesananBajaj menggunakan ulang atribut dan method induk dengan extends Pesanan.
// Method yang di-override adalah hitungTarif() untuk menambahkan logika diskon jarak.
// Rumus tarif tidak disalin agar kode tetap efisien dan memanfaatkan super.hitungTarif().