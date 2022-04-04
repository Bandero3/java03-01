package lt.codeacademy.data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Cost extends Entry {
    private static int counter = 0;

    private final CostTypes costTypes;
    private final CostCategory costCategory;

    public Cost(BigDecimal sum, LocalDateTime date, TransferStatus transferStatus, CostTypes costTypes, CostCategory costCategory) {
        this(sum, date, null, transferStatus, costTypes, costCategory);
    }

    public Cost(BigDecimal sum, LocalDateTime date, Person person, TransferStatus transferStatus, CostTypes costTypes, CostCategory costCategory) {
        super(counter++, sum, date, person, transferStatus);
        this.costTypes = costTypes;
        this.costCategory = costCategory;
    }

    public CostTypes getCostTypes() {
        return costTypes;
    }

    public CostCategory getCostCategory() {
        return costCategory;
    }

    @Override
    public String toString() {
        return "Cost{" +
                "costTypes=" + costTypes +
                ", costCategory=" + costCategory +
                super.toString() +
                '}';
    }
}
