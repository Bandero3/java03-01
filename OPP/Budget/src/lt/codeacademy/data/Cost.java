package lt.codeacademy.data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cost {
    private static int counter = 0;

    private final int index;
    private final BigDecimal sum;
    private final LocalDateTime date;
    private final Person person;
    private TransferStatus transferStatus;
    private final CostTypes costTypes;
    private final CostCategory costCategory;

    public Cost(BigDecimal sum, LocalDateTime date, TransferStatus transferStatus, CostTypes costTypes, CostCategory costCategory) {
        this(sum, date, null, transferStatus, costTypes, costCategory);
    }

    public Cost(BigDecimal sum, LocalDateTime date, Person person, TransferStatus transferStatus, CostTypes costTypes, CostCategory costCategory) {
        index=counter++;
        this.sum = sum;
        this.date = date;
        this.person = person;
        this.transferStatus = transferStatus;
        this.costTypes = costTypes;
        this.costCategory = costCategory;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Person getPerson() {
        return person;
    }

    public TransferStatus getTransferStatus() {
        return transferStatus;
    }

    public CostTypes getCostTypes() {
        return costTypes;
    }

    public CostCategory getCostCategory() {
        return costCategory;
    }

    public void setTransferStatus(TransferStatus transferStatus) {
        this.transferStatus = transferStatus;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "Cost{" +
                "index=" + index +
                ", sum=" + sum +
                ", date=" + date +
                ", person=" + person +
                ", transferStatus=" + transferStatus +
                ", costTypes=" + costTypes +
                ", costCategory=" + costCategory +
                '}';
    }
}
