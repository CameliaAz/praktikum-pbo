package sesi2;

public class RegularShipment extends Shipment{
    public RegularShipment(String kodeResi, int kg) {
        this.kodeResi = kodeResi;
        this.kg = kg;
    }

    @Override
    public int calculateFee() {
        return kg * 5000;
    }

    @Override
    public String getInfo() {
        return "[Reguler] " + kodeResi + " | " + kg + " kg | Biaya: Rp" + calculateFee();
    }
}
