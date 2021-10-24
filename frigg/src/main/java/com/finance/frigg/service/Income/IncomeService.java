package com.finance.frigg.service.Income;

import com.finance.frigg.model.Income;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IncomeService {

    public List<Income> listAllIncomes();

    public Income getIncome(long id);

    public Income save(Income income);

    public Income edit(Income income);

    public void delete(Income income);
}
