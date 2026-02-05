//package naderdeghaili.u5w1d4hw.runner;
//
//import naderdeghaili.u5w1d4hw.entities.Menu;
//import naderdeghaili.u5w1d4hw.entities.Ordine;
//import naderdeghaili.u5w1d4hw.entities.Tavolo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//
//@Component
//@Order(1)
//public class OrdineRunner implements CommandLineRunner {
//
//    private Menu menu;
//    private Double prezzoCoperto;
//
//    @Autowired
//    public OrdineRunner(Menu menu, Double prezzoCoperto) {
//        this.menu = menu;
//        this.prezzoCoperto = prezzoCoperto;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("ciao sono il runner");
//        System.out.println("----MENU----");
//        menu.printMenu();
//
//        Tavolo t1 = new Tavolo(1, 5);
//        Ordine o1 = new Ordine(1, t1, 4, prezzoCoperto);
//
//        o1.addElementoMenu(menu.getPizze().getFirst());
//        o1.addElementoMenu(menu.getBevande().getFirst());
//        o1.addElementoMenu(menu.getPizze().get(1));
//        o1.addElementoMenu(menu.getPizze().get(2));
//
//        System.out.println("---ORDINE---");
//        System.out.println(o1);
//        System.out.println("ciao e grazie dal runner");
//
//    }
//}
