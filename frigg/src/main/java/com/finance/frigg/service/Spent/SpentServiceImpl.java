package com.finance.frigg.service.Spent;

import com.finance.frigg.model.Spent;
import com.finance.frigg.repository.SpentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class SpentServiceImpl implements SpentService{

    @Autowired
    private SpentRepository spentRepository;

    @Override
    public List<Spent> listAllSpents() {
        return spentRepository.findAll();
    }

    @Override
    public Spent getSpent(long id) {
        return spentRepository.findById(id);
    }

    @Override
    public Spent save(Spent spent) {
        return spentRepository.save(spent);
    }

    @Override
    public Spent edit(Spent spent) {
        return spentRepository.save(spent);
    }

    @Override
    public void delete(Spent spent) {
        spentRepository.delete(spent);
    }
}
