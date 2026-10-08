package id.ac.polinema.inheritance.percobaan5;

public class Komputer {
    protected String merk;
    protected int kapasitasMemory;
    protected int kecepatanCPU;

    public Komputer(String merk, int kapasitasMemory, int cpu) {
        this.merk = merk;
        this.kapasitasMemory = kapasitasMemory;
        this.kecepatanCPU = cpu;
    }

    public void showInfo(){
        System.out.println("Merk          : " + merk);
        System.out.println("Memory        : " + kapasitasMemory + " GB");
        System.out.println("Kecepatan CPU : " + kecepatanCPU + " GHz");
    }

    public void nyalakanKomputer(){
        System.out.println("Komputer " + merk + "dinyalakan");
    }
}
