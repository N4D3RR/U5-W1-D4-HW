package naderdeghaili.u5w1d4hw.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("BEVANDA")
public class Bevanda extends ElementoMenu {

    public Bevanda() {
    }

    public Bevanda(String nome, double prezzo, int cal) {
        super(nome, prezzo, cal);
    }

}

