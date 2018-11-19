package fi.academy.kopselainenback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KopseController {

    private KayttajaRepository kayttajarepo;

    @Autowired
    public KopseController(KayttajaRepository kayttajarepo) {
        this.kayttajarepo = kayttajarepo;
    }

    @RequestMapping(value = "/index")
    public Iterable<Kayttaja> index() {
        Iterable<Kayttaja> kayttajat = kayttajarepo.findAll();
        return kayttajat;
    }
}
