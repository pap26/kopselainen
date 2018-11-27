package fi.academy.kopselainenback;

import javax.persistence.*;

@Entity
@Table(name = "toimihenkilo")
public class Toimihenkilo {

    @Id
    @SequenceGenerator(name="seq-gen",sequenceName="toimihenkilo_id_seq", initialValue=1, allocationSize=12)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String nimi;
    private String rooli;
    private String motto;
    private String kuva;
    private String email;

    public Toimihenkilo() {
    }

    public Toimihenkilo(String nimi, String rooli, String motto, String kuva, String email) {
        this.nimi = nimi;
        this.rooli = rooli;
        this.motto = motto;
        this.kuva = kuva;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getRooli() {
        return rooli;
    }

    public void setRooli(String rooli) {
        this.rooli = rooli;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getKuva() {
        return kuva;
    }

    public void setKuva(String kuva) {
        this.kuva = kuva;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
