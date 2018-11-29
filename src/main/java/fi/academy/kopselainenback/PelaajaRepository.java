package fi.academy.kopselainenback;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PelaajaRepository extends CrudRepository<Pelaaja, Integer> {

    List<Pelaaja> findAllByTerve(Boolean terve);


}
