public class CameraDslr extends Camera {
    private String lensType;
    private String mode;

    public CameraDslr(String brand, String model, String lensType, String mode) {
        super(brand, model);
        this.lensType = lensType;
        this.mode = mode;

    }

    public void modeSports() {
        System.out.println("Memotret aksi cepat (sports photography) dengan lensa " + lensType + "!");
    }

    public void takePhoto() {
        System.out.println("Taking a high-resolution photo with " + getBrand() + " " + getModel() + " (" + lensType + " mm lens)");
    }


    @Override
    public void displayInfo() {
        System.out.println("--- INFO KAMERA DSLR ---");
        super.displayInfo();
        System.out.println("Jenis Lensa       : " + lensType);
        System.out.println("Model Penjepretan : " + mode);
        System.out.println("Peruntukan Utama  : Foto Olahraga / Action Photography");
    }

    
}
