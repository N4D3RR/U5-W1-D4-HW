package naderdeghaili.u5w1d4hw.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@DiscriminatorValue("PIZZA")
public class Pizza extends ElementoMenu {

    @ManyToMany
    @JoinTable(
            name = "pizza_toppings",
            joinColumns = @JoinColumn(name = "pizza_id"),
            inverseJoinColumns = @JoinColumn(name = "topping_id")
    )
    private List<Topping> toppings = new ArrayList<>();


    public Pizza() {

    }

    public Pizza(String nome, double prezzo, int cal) {
        super(nome, prezzo, cal);

    }

    public void addTopping(Topping t) {
        toppings.add(t);
    }

    @Override
    public int getCal() {
        return super.getCal() + toppings.stream().mapToInt(Topping::getCal).sum();
    }

    @Override
    public double getPrezzo() {
        return super.getPrezzo() + toppings.stream().mapToDouble(Topping::getPrezzo).sum();
    }

    @Override
    public String toString() {
        return getNome() +
                " | Prezzo: " + getPrezzo() + "€" +
                " | Calorie: " + getCal() +
                " | Toppings: " + toppings;
    }

}
