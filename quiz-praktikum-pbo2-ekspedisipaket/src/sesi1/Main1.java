package sesi1;

public class Main1 {
    public static void main(String[] args) {

        ShippingCounter counter = new ShippingCounter() {

        };
        counter.addShipment(new RegularShipment("RG-001", 3));
        counter.addShipment(new ExpressShipment("EX-001", 2, 1000000));
        counter.addShipment(new CargoShipment("CG-001", 5));
        counter.addShipment(new CargoShipment("CG-002", 20));
        counter.printAll();
        System.out.println("Total biaya pengiriman: Rp" +
                counter.getTotalFee());
        counter.printTrackingReport();
        System.out.println("Total biaya asuransi: Rp" +
                counter.getTotalInsurance());
    }
}
