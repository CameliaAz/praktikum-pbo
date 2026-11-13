package sesi2;

public abstract class Shipment {
    protected String kodeResi;
    protected int kg;

    public abstract int calculateFee();
    public abstract String getInfo();

    // Default diskon 0% (berlaku untuk RegularShipment)
    public int getDiscountPercent() {
        return 0;
    }

    public String getCode() {
        return kodeResi;
    }
    
    public int getKg() {
        return kg;
    }
}
