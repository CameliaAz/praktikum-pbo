package sesi2;

public class SameDayShipment extends Shipment implements Trackable{
    public SameDayShipment(String kodeResi, int kg) {
        this.kodeResi = kodeResi;
        this.kg = kg;
    }

    @Override
    public int calculateFee() {
        return (kg * 12000) + 25000;
    }

    @Override
    public int getDiscountPercent() {
        return 15;
    }

    @Override
    public String getTrackingStatus() {
        return kodeResi + ": dalam perjalanan (hari ini)";
    }

    @Override
    public String getInfo() {
        return "[Same Day] " + kodeResi + " | " + kg + " kg | Biaya: Rp" + calculateFee();
    }
}
