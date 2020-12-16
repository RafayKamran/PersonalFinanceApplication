package com.Rafay.PersonalFinanceApplication.budget;

public class Budget {
    private final Integer budgetID;
    private final Integer budgetVal;

    public Budget(Integer budgetID, Integer budgetVal) {
        this.budgetID = budgetID;
        this.budgetVal = budgetVal;
    }

    public Integer getBudgetVal() {
        return budgetVal;
    }

    public Integer getBudgetID() {
        return budgetID;
    }
}
