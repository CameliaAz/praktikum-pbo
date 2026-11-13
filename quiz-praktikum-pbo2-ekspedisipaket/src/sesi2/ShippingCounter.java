package sesi2;

public class ShippingCounter {
    private Shipment[] items = new Shipment[10];
    private int count = 0;
    private PaymentMethod paymentMethod;

    public ShippingCounter(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void addShipment(Shipment item) {
        items[count] = item;
        count++;
    }

    public int getCount() {
        return count;
    }

    public Shipment getItem(int index) {
        return items[index];
    }

    public int getTotalFee() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += items[i].calculateFee();
        }
        return total;
    }

    // public int getMemberDiscount(Shipment shipment) {
    // int fee = shipment.calculateFee();
    // if (shipment instanceof ExpressShipment) {
    // return fee * 10 / 100;
    // } else if (shipment instanceof CargoShipment) {
    // return fee * 5 / 100;
    // } else if (shipment instanceof SameDayShipment) {
    // return fee * 15 / 100;
    // }
    // return 0; // Reguler atau lainnya 0%
    // }

    public int getMemberDiscount(Shipment shipment) {
        return shipment.calculateFee() * shipment.getDiscountPercent() / 100;
    }

    public int checkout() {
        int total = getTotalFee();
        if (paymentMethod != null) {
            return paymentMethod.charge(total);
        }
        return total;
    }
}
