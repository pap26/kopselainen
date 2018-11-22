package fi.academy.kopselainenback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import javax.xml.ws.Response;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.io.IOException;
import java.security.GeneralSecurityException;

@RestController
@RequestMapping("/api")
public class KopseController {

    private final Logger loggeri = LoggerFactory.getLogger(KopseController.class);
    private PelaajaRepository pelaajarepo;

    @Autowired
    public KopseController(PelaajaRepository pelaajarepo) {
        this.pelaajarepo = pelaajarepo;
    }

    @RequestMapping(value = "/pelaajat")
    public Iterable<Pelaaja> index() {
        Iterable<Pelaaja> pelaajat = pelaajarepo.findAll();
        return pelaajat;
    }


/*    @RequestMapping(value="/terveet")
    public Iterable<Pelaaja> terveetpelaajat() {
        Iterable<Pelaaja> terveet = pelaajarepo.findAllByTerve(true);
        return terveet;
    }

    */

    @GetMapping("/pelaaja/{id}")
    ResponseEntity<?> haeIideella(@PathVariable Integer id) {
        Optional<Pelaaja> pelaaja = pelaajarepo.findById(id);
        return pelaaja.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/pelaaja")
    ResponseEntity<Pelaaja> luoPelaaja(@Valid @RequestBody Pelaaja pelaaja) throws URISyntaxException {
        loggeri.info("Yritetään luoda pelaaja: {}", pelaaja);
        Pelaaja result = pelaajarepo.save(pelaaja);
        return ResponseEntity.created(new URI("api/pelaaja/" + result.getId()))
                .body(result);
    }

    @PutMapping("/pelaaja")
    ResponseEntity<Pelaaja> paivitaPelaaja(@Valid @RequestBody Pelaaja pelaaja) {
        loggeri.info("Yritetään päivittää pelaajaa: {}", pelaaja);
        Pelaaja result = pelaajarepo.save(pelaaja);
        return ResponseEntity.ok().body(result);
    }


    //toimii
    @DeleteMapping("/pelaaja/{id}")
    public ResponseEntity<String> poistapelaaja(@PathVariable Integer id) {
        loggeri.info("Yritetään delliä pelaajaa: {}", id);
        pelaajarepo.deleteById(id);
        return ResponseEntity.ok().build();
    }

        @GetMapping("/kalenteri/kymmenen")
        public Object haeKaikki () throws IOException, GeneralSecurityException {
            return CalendarQuickstart.tuoTapahtumat();
        }

        @GetMapping("/kalenteri/yksi")
        public Object haeYksi () throws IOException, GeneralSecurityException {
            return CalendarQuickstart.tuoYksiTapahtuma();

        }
    }

