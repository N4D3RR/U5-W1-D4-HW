//package naderdeghaili.u5w1d4hw.entities;
//
//import jakarta.persistence.Entity;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//public class Ordine {
//
//    private int numeroOrdine;
//    private StatoOrdine stato;
//    private int coperti;
//    private LocalDateTime oraOrdine;
//    private Tavolo tavolo;
//
//    private List<ElementoMenu> elementiOrdine;
//    private double prezzoCoperto;
//    private double totOrdine;
//
//    public Ordine(int numeroOrdine, Tavolo tavolo, int coperti, double prezzoCoperto) {
//        this.numeroOrdine = numeroOrdine;
//        this.tavolo = tavolo;
//        this.coperti = coperti;
//        this.prezzoCoperto = prezzoCoperto;
//        this.oraOrdine = LocalDateTime.now();
//        this.stato = StatoOrdine.IN_CORSO;
//        this.elementiOrdine = new ArrayList<>();
//
//        tavolo.occupaTavolo();
//    }
//
//    public void addElementoMenu(ElementoMenu e) {
//        elementiOrdine.add(e);
//    }
//
//    public double getTotOrdine() {
//        double totaleElementiOrdine = elementiOrdine.stream().mapToDouble(ElementoMenu::getPrezzo).sum();
//        return totaleElementiOrdine + (coperti * prezzoCoperto);
//    }
//
//    @Override
//    public String toString() {
//        return "Ordine: " + numeroOrdine +
//                "\nTavolo: " + tavolo.getNumero() +
//                "\nStato: " + stato +
//                "\nCoperti: " + coperti +
//                "\nElementi: " + elementiOrdine +
//                "\nOra: " + oraOrdine +
//                "\nTotale: " + getTotOrdine() + "€"
//                ;
//    }
//}
