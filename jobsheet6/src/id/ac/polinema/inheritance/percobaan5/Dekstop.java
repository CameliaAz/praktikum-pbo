package id.ac.polinema.inheritance.percobaan5;

public class Dekstop extends Komputer {
    protected String printer;

    public Dekstop(String merk, int memory, int cpu, String printer) {
        super(merk, memory, cpu);
        this.printer = printer;
    }

    @Override 
    public void showInfo() {
        super.showInfo();
        System.out.println("Printer        : " + printer);
    }
}
