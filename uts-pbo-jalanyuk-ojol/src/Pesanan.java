public class Pesanan {
    private String id;
    private String namaPenumpang;
    private double jarakKm;
    private Driver driver;


public Pesanan(String id, String namaPenumpang, Double jarakKm){
    this.id = id;
    this.namaPenumpang = namaPenumpang;
    this.jarakKm = jarakKm;
}

public int hitungTarif(){
    if (driver != null){
         return (int) Math.round(jarakKm * driver.getTarifPerKm());
    }
    return 0;
}
public void tugaskan(Driver driver) {
        this.driver = driver;
    }

public String getId(){
    return id;
}

public String getNamaPenumpang(){
    return namaPenumpang;
}

public Double getJarakKm(){
    return jarakKm;
}

public Driver getDriver(){
    return driver;
}

public int hitungTotal(Promo promo){
    int tarif = hitungTarif();

    if (promo != null){
        int potongan = (tarif * promo.getPersen()) / 100;
        tarif -= potongan;
    }

    return tarif;
}

public String info(){
    return id + " " + namaPenumpang + " (" +jarakKm + " km)";
}

}