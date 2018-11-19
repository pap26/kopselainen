package fi.academy.kopselainenback;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Pelaaja {

    @Id
    private Integer id; //primary key, serial!
    private String etunimi;
    private String sukunimi;
    private Integer numero;
    private boolean terve;
    private Date syntymaaika;

    public Date getSyntymaaika() {
        return syntymaaika;
    }

    public void setSyntymaaika(Date syntymaaika) {
        this.syntymaaika = syntymaaika;
    }

    private String pelipaikka;

    public Pelaaja(Integer id, String etunimi, String sukunimi, Integer numero, boolean terve, Date syntymavuosi, String pelipaikka) {
        this.id = id;
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.numero = numero;
        this.terve = terve;
        this.syntymaaika = syntymaaika;
        this.pelipaikka = pelipaikka;
    }

    public Pelaaja() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public boolean isTerve() {
        return terve;
    }

    public void setTerve(boolean terve) {
        this.terve = terve;
    }

    public String getPelipaikka() {
        return pelipaikka;
    }

    public void setPelipaikka(String pelipaikka) {
        this.pelipaikka = pelipaikka;
    }
}
