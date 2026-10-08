public class CameraMirror extends Camera {
    private String lensType;
    private String mode;

    public CameraMirror(String brand, String model, String lensType, String mode) {
        super(brand, model);
        this.lensType = lensType;
        this.mode = mode;
    }


    public void modeObjectDiam() {
        System.out.println("Memotret objek diam / produk studio secara presisi dengan " + lensType + "!");
    }

    public void takePhoto() {
        System.out.println("Taking a high-quality photo with " + getBrand() + " " + getModel() + " (" + lensType + " mm lens)");
    }

    public void lihatElectronicViewfinder() {
        System.out.println("Melihat hasil efek foto secara real-time langsung dari sensor ke EVF/LCD.");
    }

    @Override
    public void displayInfo() {
        System.out.println("--- INFO KAMERA MIRRORLESS ---");
        super.displayInfo();
        System.out.println("Jenis Lensa       : " + lensType);
        System.out.println("Model Penjepretan : " + mode);
        System.out.println("Peruntukan Utama  : Foto Objek Diam / Still Life Studio");
    }
    
}
