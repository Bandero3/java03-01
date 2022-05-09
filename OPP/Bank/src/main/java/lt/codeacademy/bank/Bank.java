package lt.codeacademy.bank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Bank {
    private final HashSet<BankAccount> bankAccounts = new HashSet<>();

    private void createBankAccount(Person person, double balance, Currency currency){
        bankAccounts.add(new BankAccount(person,balance,currency));
    }

    private Double getPersonAccountBalance(Person person){
        for(BankAccount bankAccount : bankAccounts){
            if(bankAccount.getAccountUser() == person){
                System.out.printf("%s %s - %s saskaitoje liko %d",person.getName(),person.getSurName(),bankAccount.getAccountNumber(),bankAccount.getBalance());
                return bankAccount.getBalance();
            }
        }
        return null;
    }

    public void transferMoney(Person sender, Person receiver, double amount, Currency currency){
        for(BankAccount bankAccount: bankAccounts){
            if(sender == bankAccount.getAccountUser()){
                bankAccount.takeFromBalance(amount);
            }
            if(receiver == bankAccount.getAccountUser()){
                bankAccount.addToBalance(amount);
            }
        }
    }
}
