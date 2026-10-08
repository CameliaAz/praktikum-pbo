public class Camera {
    protected String brand;
    protected String model;

    public Camera(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void takePhoto() {
        System.out.println("Taking a photo with " + brand + " " + model);
    }
    public void recordVideo() {
        System.out.println("Recording video with " + brand + " " + model);
    }

    public void displayInfo() {
        System.out.println("Camera Brand: " + brand);
        System.out.println("Camera Model: " + model);
    }
}
