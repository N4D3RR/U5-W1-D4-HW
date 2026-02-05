package naderdeghaili.u5w1d4hw.repositories;

import naderdeghaili.u5w1d4hw.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {

    List<Pizza> findByNome(String nome);

    boolean existsByNome(String nome);

    List<Pizza> findByToppingsNome(String nome);

}
