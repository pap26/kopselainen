package fi.academy.kopselainenback;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pelaaja")
public class Pelaaja {

    @Id
    @SequenceGenerator(name="seq-gen",sequenceName="pelaaja_id_seq", initialValue=10, allocationSize=12)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String etunimi;
    private String sukunimi;
    private Integer numero;
    private boolean terve;
    private Date syntymaaika;
    private String pelipaikka;
    private String puhnro;
    private String email;
    private String lempiruoka;
    private String info;
    private String kuvapolku;

    public Pelaaja() {
    }

    public Pelaaja(String etunimi, String sukunimi, Integer numero, boolean terve, Date syntymaaika, String pelipaikka, String puhnro, String email, String lempiruoka, String info, String kuvapolku) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.numero = numero;
        this.terve = terve;
        this.syntymaaika = syntymaaika;
        this.pelipaikka = pelipaikka;
        this.puhnro = puhnro;
        this.email = email;
        this.lempiruoka = lempiruoka;
        this.info = info;
        this.kuvapolku = kuvapolku;
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

    public String getPelipaikka() {
        return pelipaikka;
    }

    public void setPelipaikka(String pelipaikka) {
        this.pelipaikka = pelipaikka;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getKuvapolku() {
        return kuvapolku;
    }

    public void setKuvapolku(String kuvapolku) {
        this.kuvapolku = kuvapolku;
    }

    @Override
    public String toString() {
        return "Pelaaja{" +
                "id=" + id +
                ", etunimi='" + etunimi + '\'' +
                ", sukunimi='" + sukunimi + '\'' +
                ", numero=" + numero +
                ", terve=" + terve +
                ", syntymaaika=" + syntymaaika +
                ", pelipaikka='" + pelipaikka + '\'' +
                ", puhnro='" + puhnro + '\'' +
                ", email='" + email + '\'' +
                ", lempiruoka='" + lempiruoka + '\'' +
                '}';
    }
}
