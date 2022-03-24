package lt.codeacademy;

import lt.codeacademy.data.Cost;
import lt.codeacademy.data.CostCategory;
import lt.codeacademy.data.Income;
import lt.codeacademy.data.IncomeCategory;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Budget {
    private final Income[] incomes;
    private final Cost[] costs;

    public Budget() {
        incomes = new Income[100];
        costs = new Cost[100];
    }

    public void setIncome(Income income) {
        int index = getIndex(incomes);
        incomes[index] = income;
    }

    public void setCost(Cost cost){
        int index = getIndex(costs);
        costs[index] = cost;
    }

    public Income getIncome(IncomeCategory category, LocalDate localDate){
        for(Income income: incomes){
            if(category.equals(income.getIncomeCategory()) && localDate.isEqual(income.getDate())){
                return income;
            }
        }
        return null;
    }

    public Cost getCost(CostCategory costCategory, LocalDate localDate){
        for(Cost cost: costs){
            if(costCategory.equals(cost.getCostCategory()) && cost.getDate().toLocalDate().isEqual(localDate)){
                return cost;
            }
        }
        return null;
    }

    private int getIndex(Object[] mas) {
        for (int i = 0; i < mas.length; i++){
            if(mas[i] == null){
                return i;
            }
        }
        return mas.length + 1;
    }
}
