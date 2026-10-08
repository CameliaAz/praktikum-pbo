public class Studio {
    public static void main(String[] args) {
        CameraDslr dslrCamera = new CameraDslr("Canon", "EOS 5D Mark IV", "70-200mm", "Sports");
        dslrCamera.displayInfo();
        dslrCamera.modeSports();
        dslrCamera.takePhoto();

        System.out.println();

        CameraMirror mirrorlessCamera = new CameraMirror("Sony", "Alpha a7 III", "35mm", "Object Diam");
        mirrorlessCamera.displayInfo();
        mirrorlessCamera.modeObjectDiam();
        mirrorlessCamera.lihatElectronicViewfinder();
        mirrorlessCamera.takePhoto();

        System.out.println();

        Background bg = new Background("Hitam", "Kain");
        bg.displayInfo();
        bg.unfold();
        bg.rollUp();

        System.out.println();

        Printer printer = new Printer("Epson", 20, "Inkjet L3150");
        printer.displayInfo();
        printer.printPhoto();
        printer.spooling();
    }
}
