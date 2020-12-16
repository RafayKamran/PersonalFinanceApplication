package com.Rafay.PersonalFinanceApplication.budget;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("budgets")

public class BudgetController {

    private static final List<Budget> BUDGETS = Arrays.asList(
            new Budget(1, 100),
            new Budget(2, 500),
            new Budget(3, 1000)
    );

    @GetMapping(path = "{budgetID}")
    public Budget getBudget(@PathVariable("budgetID") Integer budgetID){
        return BUDGETS.stream()
                .filter(budget -> budgetID.equals(budget.getBudgetID()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("budget " + budgetID +
                "does not exist"));
    }
}
