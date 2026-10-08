package id.ac.polinema.relasiclass.percobaan1;

public class Laptop {
    //kelas laptop versi Aggregation 1-1(percobaan 1)
    private String merk;
    private Processor proc;

    public Laptop() {
    }

    public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }

    public Processor getProc() {
        return proc;
    }

    public void info(){
        System.out.printf("Merk Laptop = " + merk);
        proc.info();
    }
}
