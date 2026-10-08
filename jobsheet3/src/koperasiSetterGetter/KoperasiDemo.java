package koperasiSetterGetter;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Iwan", "Jl. Mawar");
        System.out.println("Simpanan " + anggota1.getNama() + " sebesar : Rp" + anggota1.getSimpanan());

        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jl. Soehat No. 1o");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + " sebesar : Rp" + anggota1.getSimpanan());

        anggota1.pinjam(50000);
        System.out.println("Simpanan " + anggota1.getNama() + " sebesar : Rp" + anggota1.getSimpanan());
    }
}
