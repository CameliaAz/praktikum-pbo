public class Printer {
    private String brand;
    private int printSpeed;
    private String model;

    public Printer(String brand, int printSpeed, String model) {
        this.brand = brand;
        this.printSpeed = printSpeed;
        this.model = model;
    }

    public void printPhoto() {
        System.out.println("Printing photo with " + brand + " printer at " + printSpeed + " pages per minute.");
    }

    public void spooling() {
        System.out.println("Spooling print job on " + model + " printer.");
    }

    public void displayInfo() {
        System.out.println("--- INFO PRINTER ---");
        System.out.println("Printer Brand: " + brand);
        System.out.println("Print Speed  : " + printSpeed + " pages per minute");
    }
}
