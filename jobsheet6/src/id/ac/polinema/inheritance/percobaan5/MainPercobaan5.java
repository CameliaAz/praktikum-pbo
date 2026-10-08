package id.ac.polinema.inheritance.percobaan5;

public class MainPercobaan5 {
    public static void main(String[] args) {
        Dekstop desk = new Dekstop("Lenovo", 2048, 3500, "Canon");
        Laptop lap = new Laptop("Asus", 1024, 2500, 720);
        Workstation work = new Workstation("Acer", 4096, 4500, "Epson", "NVIDIA");

        desk.showInfo();
        System.out.println("=======================================");
        lap.showInfo();
        System.out.println("=======================================");
        desk.nyalakanKomputer();
        System.out.println("=======================================");
        work.showInfo();
    }
}
