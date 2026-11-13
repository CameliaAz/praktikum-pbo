package sesi2;

public class CargoShipment extends Shipment {
    public CargoShipment(String kodeResi, int kg) {
        this.kodeResi = kodeResi;
        this.kg = kg;
    }
    @Override
    public int getDiscountPercent() {
        return 5;
}

    @Override
    public int calculateFee() {
        return Math.max(kg * 3000, 30000);
    }

    @Override
    public String getInfo() {
        return "[Kargo] " + kodeResi + " | " + kg + " kg | Biaya: Rp" + calculateFee();
    }
}
