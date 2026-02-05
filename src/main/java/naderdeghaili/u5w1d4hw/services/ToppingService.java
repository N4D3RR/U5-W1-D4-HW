package naderdeghaili.u5w1d4hw.services;

import lombok.extern.slf4j.Slf4j;
import naderdeghaili.u5w1d4hw.entities.Topping;
import naderdeghaili.u5w1d4hw.exceptions.ValidationException;
import naderdeghaili.u5w1d4hw.repositories.ToppingRepository;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ToppingService {

    private final ToppingRepository tr;

    public ToppingService(ToppingRepository tr) {
        this.tr = tr;
    }

    public void saveTopping(Topping newTopping) {

        if (tr.existsByNome(((newTopping.getNome()))))
            throw new ValidationException("Topping " + newTopping.getNome() + " già esistente");

        this.tr.save(newTopping);

        log.info("Il topping " + newTopping.getNome() + " è stato aggiunto");
    }
}


