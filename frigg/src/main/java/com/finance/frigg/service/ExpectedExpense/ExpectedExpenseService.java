package com.finance.frigg.service.ExpectedExpense;

import com.finance.frigg.model.ExpectedExpense;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExpectedExpenseService {

    public List<ExpectedExpense> listAllExpectedExpenses();

    public ExpectedExpense getExpectedExpense(long id);

    public ExpectedExpense save(ExpectedExpense expectedExpense);

    public ExpectedExpense edit(ExpectedExpense expectedExpense);

    public void delete(ExpectedExpense expectedExpense);
}
