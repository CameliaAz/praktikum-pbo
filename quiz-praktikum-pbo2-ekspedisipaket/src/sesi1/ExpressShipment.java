package sesi1;

public class ExpressShipment extends Shipment implements Itracking, IAsuransi {
    // Paket Ekspres dibuat dengan tiga data: resi, berat, dan nilai barang (int).
    // Premi asuransinya 1% dari nilai barang.
    private String kodeResi;
    private int kg;
    private int nilaiBarang;

    public ExpressShipment(String kodeResi, int kg, int nilaiBarang) {
        this.kodeResi = kodeResi;
        this.kg = kg;
        this.nilaiBarang = nilaiBarang;
    }

    public String getResi() {
        return kodeResi;
    }

    public double getKg() {
        return kg;
    }

    public int getNilaiBarang() {
        return nilaiBarang;
    }

    public double hitungPremiAsuransi() {
        return nilaiBarang * 0.01;
    }

    public double hitungPremi() {
        return hitungPremiAsuransi();
    }

    public String lacakPaket() {
        return "Ekspres " + kodeResi + ": dalam perjalanan (prioritas)";
    }

    @Override 
    public void asuransi(){
        System.out.println("Mendapatkan asuransi");
    }

    @Override
    public void tracking() {
        System.out.println(lacakPaket());
    }

    @Override
    public String getTracking(){
        return lacakPaket();
    }

    public int calculateFee(){
        return (kg * 8000) + 10000;
    }

     @Override
    public String getInfo() {
        return "[Express] " + kodeResi + " | " + kg + " kg | Biaya: Rp" + calculateFee();
    }

}
