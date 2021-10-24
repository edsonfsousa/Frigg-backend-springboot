package com.finance.frigg.service.Income;

import com.finance.frigg.model.Income;
import com.finance.frigg.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IncomeServiceImpl implements IncomeService {

    @Autowired
    private IncomeRepository incomeRepository;

    @Override
    public List<Income> listAllIncomes() {
        return incomeRepository.findAll();
    }

    @Override
    public Income getIncome(long id) {
        return incomeRepository.findById(id);
    }

    @Override
    public Income save(Income income) {
        return incomeRepository.save(income);
    }

    @Override
    public Income edit(Income income) {
        return incomeRepository.save(income);
    }

    @Override
    public void delete(Income income) {
        incomeRepository.delete(income);
    }
}
