package id.ac.polinema;

public class BusinessAccount extends Account {
    private static final double MINIMUM_BALANCE = 1000000.0;

    public BusinessAccount(String accountNumber, Customer owner, double balance) {
        super(accountNumber, owner, balance);
    }

    @Override
    protected boolean canWithdraw(double amount) {
        return amount > 0 && (getBalance() - amount) >= MINIMUM_BALANCE;
    }

    @Override
    public double monthlyFee() {
        // Sesuai aturan atau jika gratis, bisa diatur 0.0 (atau sesuaikan kebijakan giro bisnis)
        return 0.0; 
    }

    @Override
    public void printInfo() {
        System.out.println("Account type: Business, " + getAccountNumber() + 
                           " - " + getOwner().getName() + " - balance: " + getBalance());
    }
    
}
