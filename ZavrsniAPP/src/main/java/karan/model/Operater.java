/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

/**
 *
 * @author WinUSER
 */
@Entity
public class Operater extends Entitet{
    
    @Column(columnDefinition = "char(61)")
    private char[] lozinka;
    private String ime;
    private String prezime;
    private String email;
    private String oib;

    public char[] getLozinka() {
        return lozinka;
    }

    public void setLozinka(char[] lozinka) {
        this.lozinka = lozinka;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }
    
    
    public String getImePrezime(){
        return getIme().substring(0, 1) + getPrezime().substring(0, 1);
    }
}
