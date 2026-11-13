package sesi2;

public class MainAkhir {
    public static void main(String[] args) {
        Shipment[] items = {
            new RegularShipment("RG-001", 3),
            new ExpressShipment("EX-001", 2, 1000000),
            new CargoShipment("CG-001", 5),
            new SameDayShipment("SD-001", 2)
        };

        PaymentMethod[] methods = {
            new CashPayment(), 
            new EWalletPayment(), 
            new BankTransferPayment()
        };

        // 1. Uji ReceiptPrinter & Total
        ShippingCounter first = new ShippingCounter(methods[0]);
        for (Shipment item : items) {
            first.addShipment(item);
        }
        new ReceiptPrinter().print(first);

        // 2. Uji Diskon Member
        for (Shipment item : items) {
            System.out.println("Diskon member " + item.getCode() + ": Rp" + first.getMemberDiscount(item));
        }

        // 3. Uji Metode Pembayaran (Checkout)
        for (PaymentMethod m : methods) {
            ShippingCounter counter = new ShippingCounter(m);
            for (Shipment item : items) {
                counter.addShipment(item);
            }
            System.out.println(m.getName() + ": Rp" + counter.checkout());
        }
    }
}
