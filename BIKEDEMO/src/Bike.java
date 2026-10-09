public class Bike {
    private String brand;
    private int speed;
    private int gear=1;
    // Gear 1: max 5km/h, Gear 2: max 10km/h,..., Gear 6: max 60km/h
    private final int[] GEAR_SPEED_LIMITS = {5, 10, 25, 30, 40, 60};
    public void setBrand(String brandName) {
        this.brand = brandName;
    }
    public void gearChanges(int gearValue) {
        if (gearValue < 1 || gearValue > 6) {
            System.out.println("Invalid gear value. Please choose between 1 and 6.");
        } else {
            gear = gearValue;
        }
    }

    public int speedAcceleration(int increment){
        speed += increment;
        if (speed > GEAR_SPEED_LIMITS[gear - 1]) {  
            speed = GEAR_SPEED_LIMITS[gear - 1];
        }
        return speed;
    }

    public int speedDeceleration(int decrement){
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
        return speed;
    }

    public void printInfo() {
        System.out.println("Bike Brand: " + brand);
        System.out.println("Current Speed: " + speed + " km/h");
        System.out.println("Current Gear: " + gear);
    }
}
