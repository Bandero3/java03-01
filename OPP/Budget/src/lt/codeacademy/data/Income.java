package lt.codeacademy.data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Income extends Entry {
    private static int counter = 0;

    private final boolean isTransferToBank;
    private final IncomeCategory incomeCategory;

    public Income(BigDecimal sum, LocalDateTime date, Person person, TransferStatus transferStatus, boolean isTransferToBank, IncomeCategory incomeCategory) {
        super(counter++, sum, date, person, transferStatus);
        this.isTransferToBank = isTransferToBank;
        this.incomeCategory = incomeCategory;
    }

    public boolean isTransferToBank() {
        return isTransferToBank;
    }

    public IncomeCategory getIncomeCategory() {
        return incomeCategory;
    }

    @Override
    public String toString() {
        return "Income{" +
                "isTransferToBank=" + isTransferToBank +
                ", incomeCategory=" + incomeCategory +
                super.toString() +
                '}';
    }
}
