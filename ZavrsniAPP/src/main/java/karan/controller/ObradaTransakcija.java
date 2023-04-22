/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karan.controller;

import java.util.List;
import karan.model.Transakcija;
import karan.model.VrstaTransakcije;
import karan.util.EdunovaException;

/**
 *
 * @author WinUSER
 */
public class ObradaTransakcija extends Obrada<Transakcija> {

    @Override
    public List<Transakcija> read() {
        return session.createQuery("from Transakcija", Transakcija.class).list();
    }
    
     public List<Transakcija> read(VrstaTransakcije vt) {
        return session.createQuery("from Transakcija " +
                " where vrstaTransakcije=:vrstaTransakcije", Transakcija.class)
                .setParameter("vrstaTransakcije", vt).list();
    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        if(entitet.getVrstaTransakcije().getSifra()==0){
            throw new EdunovaException("Obavezno odabir vrste razmjene!");
        }
        if(entitet.getOsoba().getSifra()==0){
            entitet.setOsoba(null);
        }
        kontrolaOpis();
        kontrolaNapomena();
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
        kontrolaOpis();
        kontrolaNapomena();
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {

    }

    private void kontrolaOpis() throws EdunovaException {
        kontrolaOpisNull();
        kontrolaOpisMinIMaxDuzina();
    }

    private void kontrolaOpisMinIMaxDuzina() throws EdunovaException {
        if (entitet.getOpis().trim().length() < 10 || entitet.getOpis().trim().length() > 200) {
            throw new EdunovaException("Opis mora sadržavati minimalno 10 slova i maksimalno 200)");
        }
    }

    private void kontrolaOpisNull() throws EdunovaException {
        if (entitet.getOpis() == null) {
            throw new EdunovaException("Opis ne smije biti prazan");
        }
    }

    private void kontrolaNapomena() throws EdunovaException{
         kontrolaNapomenaNull();
         kontrolaNapomenaMinIMaxDuzina();
    }

    private void kontrolaNapomenaNull() throws EdunovaException{
         if (entitet.getNapomena()== null) {
            throw new EdunovaException("Napomena ne smije biti prazna");
        }
    }

    private void kontrolaNapomenaMinIMaxDuzina() throws EdunovaException {
         if (entitet.getOpis().trim().length() < 10 || entitet.getOpis().trim().length() > 200) {
            throw new EdunovaException("Napomena mora sadržavati minimalno 2 slova i maksimalno 20)");
        }
    }

}
