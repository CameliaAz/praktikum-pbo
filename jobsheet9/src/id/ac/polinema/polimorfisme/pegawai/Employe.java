package id.ac.polinema.polimorfisme.pegawai;

public class Employe {
    protected String name;

    public Employe(String name) {
        this.name = name;
    }

    public String getEmployeeInfo() {
        return "Name = " + name;
    }
}
