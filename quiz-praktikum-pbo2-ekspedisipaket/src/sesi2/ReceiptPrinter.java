package sesi2;

public class ReceiptPrinter {
    public void print(ShippingCounter counter) {
        System.out.println("=== Struk Loket ===");
        for (int i = 0; i < counter.getCount(); i++) {
            System.out.println(counter.getItem(i).getInfo());
        }
        System.out.println("Total: Rp" + counter.getTotalFee());
    }
}
