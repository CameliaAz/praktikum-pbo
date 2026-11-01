package id.ac.polinema.polimorfisme.pegawai;

public class MainPercobaan3 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        InternshipEmploye iEmp = new InternshipEmploye("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "R-1");

        Employe[] e = {pEmp, iEmp};
        Payable[] p = {pEmp, eBill};
        //Employee[] e2 = {pEmp, iEmp, eBill}; // tidak valid

        for (Employe emp : e) {
            System.out.println(emp.getEmployeeInfo());
        }

        int total = 0;
        for (Payable tagihan : p) {
            total += tagihan.getPaymentAmount();
        }
        System.out.println("Total tagihan bulan ini = " + total);
    }
}
