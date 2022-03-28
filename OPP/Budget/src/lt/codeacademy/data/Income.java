package lt.codeacademy.data;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Income {
    private static int counter = 0;

    private final int index;
    private final BigDecimal sum;
    private final LocalDate date;
    private final Person person;
    private TransferStatus transferStatus;
    private final boolean isTransferToBank;
    private final IncomeCategory incomeCategory;

    public Income(BigDecimal sum, LocalDate date, Person person, TransferStatus transferStatus, boolean isTransferToBank,IncomeCategory incomeCategory) {
        index = counter++;
        this.sum = sum;
        this.date = date;
        this.person = person;
        this.transferStatus = transferStatus;
        this.isTransferToBank = isTransferToBank;
        this.incomeCategory = incomeCategory;
    }

    public BigDecimal getSum() {
        return sum;
    }
    public int getIndex(){
        return index;
    }

    public LocalDate getDate() {
        return date;
    }

    public Person getPerson() {
        return person;
    }

    public TransferStatus getTransferStatus() {
        return transferStatus;
    }

    public boolean isTransferToBank() {
        return isTransferToBank;
    }

    public IncomeCategory getIncomeCategory() {
        return incomeCategory;
    }

    public void setTransferStatus(TransferStatus transferStatus) {
        this.transferStatus = transferStatus;
    }

    @Override
    public String toString() {
        return "Income{" +
                "index=" + index +
                ", sum=" + sum +
                ", date=" + date +
                ", person=" + person +
                ", transferStatus=" + transferStatus +
                ", isTransferToBank=" + isTransferToBank +
                ", incomeCategory=" + incomeCategory +
                '}';
    }
}
