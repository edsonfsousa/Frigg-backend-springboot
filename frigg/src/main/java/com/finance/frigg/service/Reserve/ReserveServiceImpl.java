package com.finance.frigg.service.Reserve;

import com.finance.frigg.model.Reserve;
import com.finance.frigg.repository.ReserveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class ReserveServiceImpl implements ReserveService {

    @Autowired
    private ReserveRepository reserveRepository;

    @Override
    public List<Reserve> listAllReserves() {
        return reserveRepository.findAll();
    }

    @Override
    public Reserve getReserve(long id) {
        return reserveRepository.findById(id);
    }

    @Override
    public Reserve save(Reserve reserve) {
        return reserveRepository.save(reserve);
    }

    @Override
    public Reserve edit(Reserve reserve) {
        return reserveRepository.save(reserve);
    }

    @Override
    public void delete(Reserve reserve) {
        reserveRepository.delete(reserve);
    }
}
