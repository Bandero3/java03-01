package lt.codeacademy.bank;

import org.apache.commons.lang3.RandomStringUtils;

public class BankAccount {
    private final String accountNumber;
    private double balance;
    private Currency currency;
    private final Person accountUser;

    public BankAccount(Person accountUser, double balance, Currency currency) {
        this.accountUser = accountUser;
        this.accountNumber = "LT" + RandomStringUtils.randomNumeric(18);
        this.balance = balance;
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }
    public void addToBalance(double amount){
        this.balance +=amount;
    }
    public void takeFromBalance(double amount){
        if(amount > balance){
            System.out.printf("Jusu saskaitoje nepakankamai pinigu: %d %s",balance,currency);
            return;
        }
        balance-=amount;
        System.out.printf("Nusiemete %d %s",amount,currency);
    }

    public Person getAccountUser() {
        return accountUser;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
