public class Driver {
    private String nama;
    private int tarifPerKm; 

    public Driver(String nama, int tarifPerKm){
        this.nama = nama;
        this.tarifPerKm = tarifPerKm;
    }

    public String getNamaD(){
        return nama;
    }

    public int getTarifPerKm(){
        return tarifPerKm;
    }
}

