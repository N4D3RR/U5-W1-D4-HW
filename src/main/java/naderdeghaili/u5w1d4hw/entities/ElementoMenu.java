package naderdeghaili.u5w1d4hw.entities;


import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "elemento_menu")
@DiscriminatorColumn(name = "tipo")
public abstract class ElementoMenu {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;
    private double prezzo;
    private int cal;

    public ElementoMenu() {
    }

    public ElementoMenu(String nome, double prezzo, int cal) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.cal = cal;
    }


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getCal() {
        return cal;
    }

    @Override
    public String toString() {
        return nome + " | Prezzo: " + prezzo + "€ | Calorie: " + cal + "cal";

    }
}
