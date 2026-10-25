## Deskripsi Sistem

Sistem ini memproses pesanan transportasi penumpang, menangani penugasan pengemudi (driver), dan menghitung tarif akhir secara dinamis berdasarkan jenis kendaraan serta ketersediaan kode promo.

## Struktur dan Relasi Kelas

- Kelas Induk (`Pesanan`): Menyimpan entitas dasar transaksi `(id, namaPenumpang, jarakKm, driver)` dalam visibilitas private.
- Pewarisan(Inheritance): Kelas Pesanan diwariskan ke dalam dua subkelas spesifik, yaitu `PesananMotor` dan `PesananMobil`.
- Asosiasi (`Driver`): Objek Pesanan berelasi dengan kelas Driver yang dimasukkan melalui method `tugaskan(Driver)`.
- Pesanan tidak menciptakan objek driver sendiri, dan satu driver dapat melayani banyak pesanan.
- Dependensi (`Promo`): Kelas Pesanan menggunakan kelas Promo murni hanya di dalam method `hitungTotal(Promo promo)` untuk menghitung diskon akhir, tanpa menyimpannya sebagai atribut kelas.  

## Logika Bisnis dan Overriding

- Tarif Dasar: Method `hitungTarif()` pada kelas induk menghitung jarak tempuh dikalikan `tarifPerKm` milik driver, lalu dibulatkan ke nilai Rupiah terdekat.
- PesananMotor: Meng-override `hitungTarif()` untuk menerapkan logika batas tarif minimum yang tidak boleh kurang dari Rp8.000.
- PesananMobil: Memiliki atribut tambahan kursi dan meng-override `hitungTarif()` untuk menambahkan biaya layanan tetap sebesar Rp3.000 pada tarif dasar.
- Modifikasi Output: Subkelas meng-override method `info()` turunan induk `(menggunakan super.info())` untuk menambahkan identitas spesifik di akhir teks, seperti "[Motor]" atau "[Mobil,  kursi]".

## Penambahan PesananBajaj

Jika ingin menambahkan `PesananBajaj`, kita hanya perlu membuat class baru yang mewarisi (extends) class induk Pesanan. Tidak perlu menulis ulang rumus perhitungan dasarnya. Cukup lakukan override pada method `hitungTarif()` dan panggil `super.hitungTarif()` untuk mendapatkan tarif awal. Setelah itu, tambahkan blok kondisi (if) untuk menerapkan diskon 10% apabila jarak tempuhnya kurang dari atau sama dengan 3 km.
