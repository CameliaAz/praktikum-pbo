package id.ac.polinema.inheritance.tugas1;

public class MainTugas1 {
    
public static void main(String[] args) {
        // 1. Instansiasi objek Pegawai
    Pegawai pegawai1 = new Pegawai("123", "Budi", "Malang");

        // 2. Instansiasi objek Dosen
    Dosen dosen1 = new Dosen("456", "Siti", "Surabaya");
    dosen1.setSKS(12);

        // 3. Membuat objek DaftarGaji dengan kapasitas 2
    DaftarGaji daftarGaji = new DaftarGaji(2);

        // 4. Menambahkan pegawai dan dosen ke daftar gaji
    daftarGaji.addPegawai(pegawai1);
    daftarGaji.addPegawai(dosen1);

        // 5. Mencetak nama dan gaji seluruh pegawai
    daftarGaji.printSemuaGaji();
    }
}
