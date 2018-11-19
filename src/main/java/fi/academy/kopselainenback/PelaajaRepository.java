package fi.academy.kopselainenback;

import org.springframework.data.repository.CrudRepository;

public interface PelaajaRepository extends CrudRepository <Pelaaja, Integer> {

    Iterable<Pelaaja> findByPelipaikka(Pelaaja pelaaja);

}
