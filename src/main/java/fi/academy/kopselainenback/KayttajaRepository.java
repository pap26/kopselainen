package fi.academy.kopselainenback;

import org.springframework.data.repository.CrudRepository;

public interface KayttajaRepository extends CrudRepository <Kayttaja, Integer> {

    Iterable<Kayttaja> findBynimi(Kayttaja kayttaja);


}




