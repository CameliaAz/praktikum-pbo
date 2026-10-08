package id.ac.polinema.relasiclass.percobaan5;

public class Mobil {
    private String merk;
    private Mesin mesin;

    public Mobil(String merk){
        this.merk = merk;
        this.mesin = new Mesin();
    }

    public void tampilkanInfo(){
        System.out.println("Mobil: " + merk);
        System.out.println("Mesin: "+ mesin.getTipe());
    }
}

