package id.ac.polinema.polimorfisme.pegawai;

public class MainPercobaan2 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        Employe e;
        
        e = pEmp;
        System.out.println(e.getEmployeeInfo());
        System.out.println("-------------------------");
        System.out.println(pEmp.getEmployeeInfo());
        
        InternshipEmploye iEmp = new InternshipEmploye("Sunarto", 5);
        e = iEmp;
        // Eksperimen
        //System.out.println(e.getSalary());
        System.out.println("-------------------------");
        System.out.println(e.getEmployeeInfo()); // pernyataan sama, objek berbeda
    }
}
