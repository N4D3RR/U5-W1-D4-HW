package naderdeghaili.u5w1d4hw.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("TOPPING")
public class Topping extends ElementoMenu {

    @ManyToMany(mappedBy = "toppings")

    private List<Pizza> pizze = new ArrayList<>();

    public Topping() {

    }

    public Topping(String nome, double prezzo, int cal) {
        super(nome, prezzo, cal);
    }


}
