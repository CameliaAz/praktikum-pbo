public class Background {
    private String color;
    private String pattern;

    public Background(String color, String pattern) {
        this.color = color;
        this.pattern = pattern;
    }

    public String getColor() {
        return color;
    }

    public String getPattern() {
        return pattern;
    }

    public void unfold() {
        System.out.println("Background warna " + color + " berbahan " + pattern + " dibentangkan.");
    }

    public void rollUp() {
        System.out.println("Background warna " + color + " digulung kembali.");
    }

    public void displayInfo() {
        System.out.println("--- BACKGROUND ---");
        System.out.println("Warna Background  : " + color);
        System.out.println("Bahan Background  : " + pattern);
    }
}
