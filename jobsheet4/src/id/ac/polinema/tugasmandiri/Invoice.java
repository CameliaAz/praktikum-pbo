package id.ac.polinema.tugasmandiri;

public class Invoice {
    private String noInvoice;
    private double totalBayar;

    public Invoice(String noInvoice){
        this.noInvoice = noInvoice;
        this.totalBayar = 0.0;
    }

    public void setTotalBayar(double totalBayar){
        this.totalBayar = totalBayar;
    }

    public String getNoInvoice(){
        return noInvoice;
    }

    public double getTotalBayar(){
        return totalBayar;
    }
}
