package com.finance.frigg.service.ExpectedExpense;

import com.finance.frigg.model.ExpectedExpense;
import com.finance.frigg.repository.ExpectedExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ExpectedExpenseImpl implements ExpectedExpenseService {

    @Autowired
    private ExpectedExpenseRepository expectedExpenseRepository;

    @Override
    public List<ExpectedExpense> listAllExpectedExpenses() {
        return expectedExpenseRepository.findAll();
    }

    @Override
    public ExpectedExpense getExpectedExpense(long id) {
        return expectedExpenseRepository.findById(id);
    }

    @Override
    public ExpectedExpense save(ExpectedExpense expectedExpense) {
        return expectedExpenseRepository.save(expectedExpense);
    }

    @Override
    public ExpectedExpense edit(ExpectedExpense expectedExpense) {
        return expectedExpenseRepository.save(expectedExpense);
    }

    @Override
    public void delete(ExpectedExpense expectedExpense) {
        expectedExpenseRepository.delete(expectedExpense);
    }
}
