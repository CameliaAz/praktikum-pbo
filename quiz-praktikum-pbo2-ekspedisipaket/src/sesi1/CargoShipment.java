package sesi1;

public class CargoShipment extends Shipment implements Itracking{
    private String kodeResi;
    private int kg;

    public CargoShipment(String kodeResi, int kg){
        this.kodeResi = kodeResi;
        this.kg = kg;
    }

    public String getResi(){
        return kodeResi;
    }

     public String lacakPaket() {
        return kodeResi + ": dalam perjalanan (kargo darat)";
    }
     @Override
    public void tracking() {
        System.out.println(lacakPaket());
    }

    @Override
    public String getTracking(){
        return lacakPaket();
    }

    public int calculateFee() {
        return Math.max(kg * 3_000, 30_000);
    }

     @Override
    public String getInfo() {
        return "[Kargo] " + kodeResi + " | " + kg + " kg | Biaya: Rp" + calculateFee();
    }
}
