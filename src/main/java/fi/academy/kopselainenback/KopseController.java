package fi.academy.kopselainenback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.GeneralSecurityException;

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

    @GetMapping("/kalenteri/kymmenen")
    public Object haeKaikki() throws IOException, GeneralSecurityException {
        return CalendarQuickstart.tuoTapahtumat();
    }
    @GetMapping("/kalenteri/yksi")
    public Object haeYksi() throws IOException, GeneralSecurityException {
        return CalendarQuickstart.tuoYksiTapahtuma();
    }
}
