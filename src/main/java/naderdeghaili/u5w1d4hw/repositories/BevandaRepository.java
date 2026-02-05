package naderdeghaili.u5w1d4hw.repositories;

import naderdeghaili.u5w1d4hw.entities.Bevanda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BevandaRepository extends JpaRepository<Bevanda, Long> {
    Bevanda findFirstBy();

}
