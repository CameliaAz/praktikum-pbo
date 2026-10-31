package tugas;

public class Program {
    public static void main(String[] args) {
        Keledai kedelai = new Keledai("Keledai", 4, "Hehehehe", "Abu-Abu");
        Gorilla gorilla = new Gorilla("Gulali", 4, "Haaum Hauum", "Hitam Manis");
        Singa singa = new Singa("CingaCing", 4, "Roaar Roaaar", "Coklat");

        kedelai.displayData();
        gorilla.displayData();
        singa.displayData();
    }
}
