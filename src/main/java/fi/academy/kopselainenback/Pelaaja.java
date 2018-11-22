package fi.academy.kopselainenback;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pelaaja")
public class Pelaaja {

    @Id
    @GeneratedValue
    private Integer id; //primary key, serial!
    private String etunimi;
    private String sukunimi;
    private Integer numero;
    private boolean terve;
    private Date syntymaaika;
    private String pelipaikka;
    private String puhnro;
    private String email;
    private String lempiruoka;

    public Pelaaja() {
    }

    public Pelaaja(String etunimi, String sukunimi, Integer numero, boolean terve, Date syntymaaika, String puhnro, String email, String lempiruoka) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.numero = numero;
        this.terve = terve;
        this.pelipaikka = pelipaikka;
        this.syntymaaika = syntymaaika;
        this.puhnro = puhnro;
        this.email = email;
        this.lempiruoka = lempiruoka;
    }

    public String getPelipaikka() {
        return pelipaikka;
    }

    public void setPelipaikka(String pelipaikka) {
        this.pelipaikka = pelipaikka;
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

    public Date getSyntymaaika() {
        return syntymaaika;
    }

    public void setSyntymaaika(Date syntymaaika) {
        this.syntymaaika = syntymaaika;
    }

    public String getPuhnro() {
        return puhnro;
    }

    public void setPuhnro(String puhnro) {
        this.puhnro = puhnro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLempiruoka() {
        return lempiruoka;
    }

    public void setLempiruoka(String lempiruoka) {
        this.lempiruoka = lempiruoka;
    }
}
