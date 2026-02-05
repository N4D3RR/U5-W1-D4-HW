//package naderdeghaili.u5w1d4hw.entities;
//
//import jakarta.persistence.Entity;
//
//import java.util.List;
//
//@Entity
//public class Menu {
//    private List<Pizza> pizze;
//    private List<Bevanda> bevande;
//    private List<Topping> toppings;
//
//    public Menu(List<Pizza> pizze, List<Bevanda> bevande, List<Topping> toppings) {
//        this.pizze = pizze;
//        this.bevande = bevande;
//        this.toppings = toppings;
//    }
//
//    public void printMenu() {
//        System.out.println("\n--- MENU ---");
//        System.out.println(" \nPIZZE: ");
//        pizze.forEach(p -> System.out.println(" - " + p));
//
//        System.out.println(" \nBEVANDE: ");
//        bevande.forEach(b -> System.out.println(" - " + b));
//
//        System.out.println(" \nTOPPINGS: ");
//        toppings.forEach(t -> System.out.println(" - " + t));
//    }
//
//
//    public List<Pizza> getPizze() {
//        return pizze;
//    }
//
//    public List<Bevanda> getBevande() {
//        return bevande;
//    }
//
//    public List<Topping> getToppings() {
//        return toppings;
//    }
//}
