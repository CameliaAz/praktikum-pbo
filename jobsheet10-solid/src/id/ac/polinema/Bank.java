package id.ac.polinema;

import java.util.LinkedHashMap;
import java.util.Map;


public class Bank {
    private AccountRepository repository;
    // private Map<String, Account> accounts = new LinkedHashMap<>();
    // private Account[] accounts;
    // private int count;

    // public Bank(int capacity) {
    //     accounts = new Account[capacity];
    //     count = 0;
    // }

    public Bank(AccountRepository repository) {
        this.repository = repository;
    }

    public boolean addAccount(Account account) {
        if (repository.findByNumber(account.getAccountNumber()) != null) {
            return false;
            }
            repository.save(account);
            return true;
        }
    
    // public boolean addAccount(Account account) {
    //     if (accounts.containsKey(account.getAccountNumber())) {
    //         return false;
    //     }
    //     accounts.put(account.getAccountNumber(), account);
    //     return true;
    // }

    // public Account findAccount(String accountNumber) {
    //    return accounts.get(accountNumber);
    // }

    public Account findAccount(String accountNumber) {
        return repository.findByNumber(accountNumber);
    }

    // public void printAllAccounts() {
    //     for (Account acc : accounts.values()) {
    //         acc.printInfo();
    //     }
    // }

    public void printAllAccounts() {
        for (Account acc : repository.findAll()) {
            acc.printInfo();
        }
    }

    // public void printMonthlyFees() {
    //     for (Account acc : accounts.values()){
    //     System.out.println(acc.getAccountNumber() + " fee: " + acc.monthlyFee());
    //     }
    // }

    public void printMonthlyFees() {
        for (Account acc : repository.findAll()){
            System.out.println(acc.getAccountNumber() + " fee: " + acc.monthlyFee());
        }
    }

    // public void processMonthEnd() {
    //     for (Account acc : accounts.values()){
    //         if (acc instanceof InterestBearing bearing) {
    //         bearing.applyInterest();
    //         System.out.println(acc.getAccountNumber() + " interest applied, new balance: " + acc.getBalance());
    //     }
    //         System.out.println(acc.getAccountNumber() + " monthly fee: " + acc.monthlyFee());
    //     }
    // }

    public void processMonthEnd() {
        for (Account acc : repository.findAll()){
            if (acc instanceof InterestBearing bearing) {
                bearing.applyInterest();
                System.out.println(acc.getAccountNumber() + " interest applied, new balance: " + acc.getBalance());
            }
            System.out.println(acc.getAccountNumber() + " monthly fee: " + acc.monthlyFee());
        }
    }

    public void printHistory(String accountNumber) {
        Account acc = findAccount(accountNumber);
        if (acc == null) {
            System.out.println("Account not found." + accountNumber);
            return;
        }
        for (Transaction t : acc.getHistory()) {
            System.out.println(accountNumber + " " + t);
        }
    }
}
