package naderdeghaili.u5w1d4hw.repositories;

import naderdeghaili.u5w1d4hw.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToppingRepository extends JpaRepository<Topping, Long> {

    List<Topping> findByNome(String nome);

    boolean existsByNome(String nome);
}
