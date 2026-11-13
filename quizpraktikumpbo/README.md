# Sistem Pemesanan Restoran & Pengiriman Kurir

Aplikasi berbasis Java ini mensimulasikan sistem pemesanan makanan (*food delivery*) yang mengintegrasikan data restoran, kurir pengantar, dan rincian pesanan pelanggan untuk menghitung total biaya secara otomatis.

---

## Fitur Utama
* **Manajemen Restoran:** Mengelola informasi nama restoran, harga menu per porsi, serta jarak tempuh lokasi pengiriman.
* **Manajemen Kurir:** Mengatur data nama kurir beserta tarif dasar ongkos kirim per kilometer.
* **Kalkulasi Biaya Otomatis:**
  * Menghitung total harga makanan berdasarkan jumlah porsi.
  * Menghitung total ongkos kirim (*ongkir*) berdasarkan perkalian jarak tempuh dengan tarif kurir.
  * Menghitung total keseluruhan pembayaran (*Grand Total*) yang menggabungkan biaya makanan dan ongkir.
* **Struk Pesanan Terstruktur:** Menampilkan laporan detail pesanan, rincian kurir, dan total tagihan langsung ke konsol.

---

## Struktur Komponen Sistem
Berdasarkan alur eksekusi pada `MainPelangganRestoran.java`, sistem ini dirancang menggunakan pendekatan Berorientasi Objek (*Object-Oriented Programming*) yang melibatkan 3 entitas utama:
1. **`Restoran`**: Menyimpan data terkait menu, harga, dan jarak lokasi.
2. **`Kurir`**: Menyimpan data profil kurir dan tarif pengiriman.
3. **`Pesanan`**: Menghubungkan objek restoran dan kurir untuk memproses nomor pesanan, jumlah porsi, serta kalkulasi tagihan akhir.

---

## Output Program
```text
=== DETAIL PESANAN [A001] ===
Restoran     : Bubur Ayam Mang Udin
Pesanan      : 3 porsi @ Rp 15000
Total Makanan: Rp 45000
----------------------------------------
Kurir        : Mr. X
Jarak        : 15.5 km @ Rp 6000/km
Total Ongkir : Rp 93000
----------------------------------------
GRAND TOTAL  : Rp 138000
