package com.finance.frigg.service.Spent;

import com.finance.frigg.model.Spent;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpentService {

        public List<Spent> listAllSpents();

        public Spent getSpent(long id);

        public Spent save(Spent spent);

        public Spent edit(Spent spent);

        public void delete(Spent spent);
    }