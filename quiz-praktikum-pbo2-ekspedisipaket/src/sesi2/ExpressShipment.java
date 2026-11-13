package sesi2;

public class ExpressShipment extends Shipment{
    private int nilaiBarang;

    public ExpressShipment(String kodeResi, int kg, int nilaiBarang) {
        this.kodeResi = kodeResi;
        this.kg = kg;
        this.nilaiBarang = nilaiBarang;
    }

    @Override
    public int getDiscountPercent() {
        return 10;
}

    @Override
    public int calculateFee() {
        return (kg * 8000) + 10000;
    }

    @Override
    public String getInfo() {
        return "[Ekspres] " + kodeResi + " | " + kg + " kg | Biaya: Rp" + calculateFee();
    }
}
