package lt.codeacademy;

import lt.codeacademy.data.Cost;
import lt.codeacademy.data.CostCategory;
import lt.codeacademy.data.Income;
import lt.codeacademy.data.IncomeCategory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Budget {
    private final List<Income> incomes;
    private final List<Cost> costs;

    public Budget() {
        incomes = new ArrayList<>();
        costs = new ArrayList<>();
    }

    public double balance() {
        double incomeSum = 0;
        double costSum = 0;
        for (Income i : incomes) {
            incomeSum += i.getSum().doubleValue();
        }
        for (Cost c : costs) {
            costSum += c.getSum().doubleValue();
        }
        return incomeSum - costSum;
    }

    public List<Income> getIncomes() {
        return incomes;
    }

    public List<Cost> getCosts() {
        return costs;
    }

    public void setIncome(Income income) {
        incomes.add(income);
    }

    public void setCost(Cost cost) {
        costs.add(cost);
    }

    public Income getIncome(IncomeCategory category, LocalDate localDate) {
        for (Income income : incomes) {
            if (category.equals(income.getIncomeCategory()) && localDate.isEqual(income.getDate())) {
                return income;
            }
        }
        return null;
    }

    public Cost getCost(CostCategory costCategory, LocalDate localDate) {
        for (Cost cost : costs) {
            if (costCategory.equals(cost.getCostCategory()) && cost.getDate().toLocalDate().isEqual(localDate)) {
                return cost;
            }
        }
        return null;
    }

    public void removeIncome(int index) {
        Iterator<Income> iterator = incomes.iterator();
        while (iterator.hasNext()) {
            Income income = iterator.next();
            if (income.getIndex() == index) ;
            iterator.remove();
            break;
        }
    }

    public void removeCost(int index) {
        Iterator<Cost> iterator = costs.iterator();
        while (iterator.hasNext()) {
            Cost cost = iterator.next();
            if (cost.getIndex() == index) ;
            iterator.remove();
            break;
        }
    }

}
