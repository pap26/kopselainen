package fi.academy.kopselainenback;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
    public class Kayttaja {

        @Id
        private Integer id; //db:n primary key, serial
        private String nimi;
        private String salasana;
        private boolean admin; //jos vain kaksi käyttäjäryhmää, adminit ja muut

    public Kayttaja() {
    }

    public Kayttaja(String nimi, String salasana, boolean admin) {
        this.nimi = nimi;
        this.salasana = salasana;
        this.admin = admin;
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

    public String getSalasana() {
        return salasana;
    }

    public void setSalasana(String salasana) {
        this.salasana = salasana;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Kayttaja{" +
                "nimi='" + nimi + '\'' +
                ", salasana='" + salasana + '\'' +
                ", admin=" + admin +
                '}';
    }
}
