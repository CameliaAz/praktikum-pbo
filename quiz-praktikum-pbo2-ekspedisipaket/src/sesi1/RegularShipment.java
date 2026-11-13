package sesi1;
public class RegularShipment extends Shipment {
    private String kodeResi;
    private int kg;

    public RegularShipment(String kodeResi, int kg) {
        this.kodeResi = kodeResi;
        this.kg = kg;
    }

    public String getKodeResi() {
        return kodeResi;
    }

    public int getKg() {
        return kg;
    }

    public void setKodeResi(String kodeResi) {
        this.kodeResi = kodeResi;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public int calculateFee() {
        return kg * 5000;
    }

    @Override
    public String getInfo() {
        return "[Regular] " + kodeResi + " | " + kg + " kg | Biaya: Rp" + calculateFee();
    }
}
