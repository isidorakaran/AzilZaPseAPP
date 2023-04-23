/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karan.controller;

import java.util.List;
import karan.model.Osoba;
import karan.model.Transakcija;
import karan.model.VrstaTransakcije;
import karan.util.EdunovaException;
import karan.model.Pas;

/**
 *
 * @author WinUSER
 */
public class ObradaTransakcija extends Obrada<Transakcija> {

    @Override
    public List<Transakcija> read() {
        return session.createQuery("from Transakcija order by opis, datum", Transakcija.class).list();
    }

    public List<Transakcija> read(String uvjet) {
        uvjet = uvjet.trim();
        uvjet = "%" + uvjet + "%";
        return session.createQuery("from Transakcija "
                + " where concat(opis,' ',datum) "
                + " like :uvjet "
                + " order by opis,datum ",
                Transakcija.class)
                .setParameter("uvjet", uvjet)
                .setMaxResults(12)
                .list();
    }

    public List<Transakcija> read(VrstaTransakcije vt) {
        return session.createQuery("from Transakcija "
                + " where vrstaTransakcije=:vrstaTransakcije", Transakcija.class)
                .setParameter("vrstaTransakcije", vt).list();
    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        kontrolaNazivDupliUBazi();
        if (entitet.getVrstaTransakcije().getSifra() == 0) {
            throw new EdunovaException("Obavezno odabir vrste razmjene!");
        }
        if (entitet.getOsoba().getSifra() == 0) {
            entitet.setOsoba(null);
        }
        kontrolaOpis();
        kontrolaNapomena();
        kontrolaDatum();

    }
    
    private void kontrolaDatum() throws EdunovaException{
        
    }

    private void kontrolaNazivDupliUBazi() throws EdunovaException {
        List<Transakcija> transakcije = null;
        try {
            transakcije = session.createQuery("from Transakcija t "
                    + " where t.opis=:opis",
                    Transakcija.class)
                    .setParameter("opis", entitet.getOpis())
                    .list();
        } catch (Exception e) {
        }
        if (transakcije != null && !transakcije.isEmpty()) {
            throw new EdunovaException("Transakcija s istim opisom postoji u bazi");
        }
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
        kontrolaOpis();
        kontrolaNapomena();
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
        if (entitet.getOsoba() != null) {
            throw new EdunovaException("Razmjena se ne može obrisati jer pripada nekoj osobi."
            );
        }
       
    }

    private void kontrolaOpis() throws EdunovaException {
        kontrolaOpisNull();
         kontrolaObavezanUnos();
        kontrolaOpisMinIMaxDuzina();
       
    }
    private void kontrolaObavezanUnos()throws EdunovaException{
        if(entitet.getOpis().trim().isEmpty()){
            throw new EdunovaException("Obavezno unesite opis!");
        }
    }

    private void kontrolaOpisMinIMaxDuzina() throws EdunovaException {
        if (entitet.getOpis().trim().length() < 10 || entitet.getOpis().trim().length() > 200) {
            throw new EdunovaException("Opis mora sadržavati minimalno 5 slova i maksimalno 100)");
        }
    }

    private void kontrolaOpisNull() throws EdunovaException {
        if (entitet.getOpis() == null) {
            throw new EdunovaException("Opis ne smije biti prazan");
        }
    }

    private void kontrolaNapomena() throws EdunovaException {
        kontrolaNapomenaNull();
        kontrolaNapomenaObavezanUnos();
        kontrolaNapomenaMinIMaxDuzina();
    }
    private void kontrolaNapomenaObavezanUnos()throws EdunovaException{
        if(entitet.getNapomena().trim().isEmpty()){
            throw new EdunovaException("Obavezno unesite napomenu!");
        }
    }

    private void kontrolaNapomenaNull() throws EdunovaException {
        if (entitet.getNapomena() == null) {
            throw new EdunovaException("Napomena ne smije biti prazna");
        }
    }

    private void kontrolaNapomenaMinIMaxDuzina() throws EdunovaException {
        if (entitet.getOpis().trim().length() < 10 || entitet.getOpis().trim().length() > 200) {
            throw new EdunovaException("Napomena mora sadržavati minimalno 2 slova i maksimalno 20)");
        }
    }

}
