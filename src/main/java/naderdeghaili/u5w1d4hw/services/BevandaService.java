package naderdeghaili.u5w1d4hw.services;

import lombok.extern.slf4j.Slf4j;
import naderdeghaili.u5w1d4hw.entities.Bevanda;
import naderdeghaili.u5w1d4hw.exceptions.ValidationException;
import naderdeghaili.u5w1d4hw.repositories.BevandaRepository;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BevandaService {

    private final BevandaRepository br;


    public BevandaService(BevandaRepository br) {
        this.br = br;
    }

    public void saveBevanda(Bevanda newBevanda) {

        if (br.existsByNome(((newBevanda.getNome()))))
            throw new ValidationException("Bevanda " + newBevanda.getNome() + " già esistente");

        this.br.save(newBevanda);

        log.info("La bevanda " + newBevanda.getNome() + " è stata aggiunta");
    }
}
