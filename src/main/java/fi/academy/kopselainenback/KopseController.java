package fi.academy.kopselainenback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KopseController {

    private PelaajaRepository pelaajarepo;

    @Autowired
    public KopseController(PelaajaRepository pelaajarepo) {
        this.pelaajarepo = pelaajarepo;
    }

    @RequestMapping(value = "/index")
    public Iterable<Pelaaja> index() {
        Iterable<Pelaaja> pelaajat = pelaajarepo.findAll();
        return pelaajat;
    }
}
