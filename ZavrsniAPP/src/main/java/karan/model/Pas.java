package karan.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Pas extends Entitet {

    private boolean mjesavina;
    private String ime;
    private String pol;
    private String dob;
    private BigDecimal kilaza;
    @ManyToMany
    private List<Transakcija> transakcije;

    public Pas() {
        super();
        transakcije = new ArrayList<>();
    }

    public Pas(int sifra, boolean mjesavina, String ime, String pol, String dob, BigDecimal kilaza,
            List<Transakcija> transakcije) {
        super(sifra);
        this.mjesavina = mjesavina;
        this.ime = ime;
        this.pol = pol;
        this.dob = dob;
        this.kilaza = kilaza;
        this.transakcije = transakcije;
    }

    public boolean isMjesavina() {
        return mjesavina;
    }

    public void setMjesavina(boolean mjesavina) {
        this.mjesavina = mjesavina;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public BigDecimal getKilaza() {
        return kilaza;
    }

    public void setKilaza(BigDecimal kilaza) {
        this.kilaza = kilaza;
    }

    public List<Transakcija> getTransakcije() {
        return transakcije;
    }

    public void setTransakcije(List<Transakcija> transakcije) {
        this.transakcije = transakcije;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ime;
    }

}
