package naderdeghaili.u5w1d4hw.runner;


import lombok.extern.slf4j.Slf4j;
import naderdeghaili.u5w1d4hw.entities.Bevanda;
import naderdeghaili.u5w1d4hw.entities.Pizza;
import naderdeghaili.u5w1d4hw.entities.Topping;
import naderdeghaili.u5w1d4hw.services.BevandaService;
import naderdeghaili.u5w1d4hw.services.PizzaService;
import naderdeghaili.u5w1d4hw.services.ToppingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class ElementoMenuRunner implements CommandLineRunner {

    private final PizzaService ps;
    private final BevandaService bs;
    private final ToppingService ts;

    public ElementoMenuRunner(PizzaService ps, BevandaService bs, ToppingService ts) {
        this.ps = ps;
        this.bs = bs;
        this.ts = ts;
    }

    @Override
    public void run(String... args) throws Exception {
        Topping mozzarella = new Topping("Mozzarella", 1.0, 200);
        Topping pomodoro = new Topping("Pomodoro", 0.5, 50);
        Topping salame = new Topping("Salame piccante", 1.5, 250);
        Topping prosciuttoCotto = new Topping("Prosciutto cotto", 1.2, 180);

//        ts.saveTopping(mozzarella);
//        ts.saveTopping(pomodoro);
//        ts.saveTopping(salame);
//        ts.saveTopping(prosciuttoCotto);


        Pizza margherita = new Pizza("Margherita", 5.0, 700);
        margherita.addTopping(pomodoro);
        margherita.addTopping(mozzarella);

        Pizza diavola = new Pizza("Diavola", 6.5, 800);
        diavola.addTopping(pomodoro);
        diavola.addTopping(mozzarella);
        diavola.addTopping(salame);

        Pizza prosciutto = new Pizza("Prosciutto Cotto", 7.0, 850);
        prosciutto.addTopping(pomodoro);
        prosciutto.addTopping(mozzarella);
        prosciutto.addTopping(prosciuttoCotto);

//        ps.savePizza(margherita);
//        ps.savePizza(diavola);
//        ps.savePizza(prosciutto);


        Bevanda acqua = new Bevanda("Acqua naturale", 1.0, 0);
        Bevanda cocaCola = new Bevanda("Coca Cola", 2.5, 150);
        Bevanda fanta = new Bevanda("Fanta", 2.5, 160);

//        bs.saveBevanda(acqua);
//        bs.saveBevanda(cocaCola);
//        bs.saveBevanda(fanta);

        List<Pizza> pMozza = ps.getPizzaByTopping("Mozzarella");
        log.info("--- Pizze con mozzarella --- ");
        pMozza.forEach(p -> log.info(p.getNome()));


        List<Pizza> pProsciutto = ps.getPizzaByTopping("Prosciutto cotto");
        log.info("--- Pizze con prosciutto --- ");
        pProsciutto.forEach(p -> log.info("Pizza con prosciutto cotto: " + p.getNome()));


    }
}
