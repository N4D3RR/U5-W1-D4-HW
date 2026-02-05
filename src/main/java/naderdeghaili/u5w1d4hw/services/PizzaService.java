package naderdeghaili.u5w1d4hw.services;

import lombok.extern.slf4j.Slf4j;
import naderdeghaili.u5w1d4hw.entities.Pizza;
import naderdeghaili.u5w1d4hw.exceptions.ValidationException;
import naderdeghaili.u5w1d4hw.repositories.PizzaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PizzaService {

    private final PizzaRepository pr;


    public PizzaService(PizzaRepository pr) {
        this.pr = pr;
    }

    public void savePizza(Pizza newPizza) {
        if (pr.existsByNome((newPizza.getNome())))
            throw new ValidationException("Pizza " + newPizza.getNome() + " già esistente");

        this.pr.save(newPizza);

        log.info("La pizza " + newPizza.getNome() + " è stata aggiunta");
    }

    public List<Pizza> getPizzaByTopping(String nomeTopping) {
        return pr.findByToppingsNome(nomeTopping);
    }
}
