package karan.model;

import jakarta.persistence.Entity;

@Entity
public class VrstaTransakcije extends Entitet {

    private String naziv;
    private int predznak;

    public VrstaTransakcije() {
        super();
    }

    public VrstaTransakcije(int sifra, String naziv,int predznak) {
        super(sifra);
        this.naziv = naziv;
        this.predznak=predznak;
    }

    public int getPredznak() {
        return predznak;
    }

    public void setPredznak(int predznak) {
        this.predznak = predznak;
    }
    

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

}
