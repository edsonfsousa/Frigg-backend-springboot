package com.finance.frigg.service.Reserve;

import com.finance.frigg.model.Reserve;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ReserveService {

    public List<Reserve> listAllReserves();

    public Reserve getReserve(long id);

    public Reserve save(Reserve reserve);

    public Reserve edit(Reserve reserve);

    public void delete(Reserve reserve);
}
