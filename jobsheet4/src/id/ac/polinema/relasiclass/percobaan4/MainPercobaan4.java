package id.ac.polinema.relasiclass.percobaan4;

public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Penumpang russel = new Penumpang("11122", "Mr. Russel");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        gerbong.setPenumpang(russel, 1);
        System.out.println(gerbong.info());
    }
}
