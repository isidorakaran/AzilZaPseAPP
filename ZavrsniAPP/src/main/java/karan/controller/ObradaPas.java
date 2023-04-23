/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karan.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import karan.model.Pas;
import karan.model.Transakcija;
import karan.model.VrstaTransakcije;
import karan.util.EdunovaException;

/**
 *
 * @author WinUSER
 */
public class ObradaPas extends Obrada<Pas> {

    @Override
    public List<Pas> read() {
        return session.createQuery("from Pas", Pas.class).list();
    }
    
  
   

  /* public List<Pas> read(VrstaTransakcije vt) {
        List<Pas> p = new ArrayList<>();
        List<Object[]> lista = session.createNativeQuery(
                " select a.* "
                + " from pas a "
                + " inner join pas_transakcija b on a.sifra=b.Pas_sifra "
                + " inner join transakcija c on b.transakcije_sifra=c.sifra "
                + " inner join vrstatransakcije d on c.vrstaTransakcije_sifra=d.sifra "
                + " where d.sifra= "+ vt.getSifra() , Object[].class).getResultList();
        Pas pp;
        for (Object[] niz : lista) {
            pp = new Pas();
            pp.setSifra(Integer.parseInt(niz[0].toString()));
            pp.setIme(niz[2].toString());
            p.add(pp);
        }

        return p;
    }*/

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        //kontrolaMjesavina();
      
        kontrolaIme();
          kontrolaPol();
        kontrolaDob();
        kontrolaKilaza();
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
        kontrolaIme();
        kontrolaPol();
        kontrolaDob();
        kontrolaKilaza();
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
    }

    private void kontrolaIme() throws EdunovaException {
        kontrolaImeNull();
        kontrolaImeObavezno();
        kontrolaImeNijeBroj();
        kontrolaImeNijeZnak();
        kontrolaImeMinIMaxDuzina();
    }
    private void kontrolaImeObavezno()throws EdunovaException{
         if(entitet.getIme().trim().isEmpty()){
            throw new EdunovaException("Obavezno unesite ime psa!");
        }
    }

    private void kontrolaImeNijeBroj() throws EdunovaException {
        boolean broj = false;
        try {
            Double.parseDouble(entitet.getIme());
            broj = true;
        } catch (Exception e) {
        }
        if (broj) {
            throw new EdunovaException("Ime ne smije biti broj niti znak");
        }
    }

    private void kontrolaImeNijeZnak() throws EdunovaException {
        for (int i = 0; i < entitet.getIme().length(); i++) {
            if (Character.isLetter(entitet.getIme().charAt(i))) {
                continue;
            } else {
                throw new EdunovaException("Ime ne smije sadržavati znakove niti brojeve");
            }
        }
    }

    private void kontrolaImeNull() throws EdunovaException {
        if (entitet.getIme() == null) {
            throw new EdunovaException("Ime mora biti postavljeno");
        }
    }

    private void kontrolaImeMinIMaxDuzina() throws EdunovaException {
        if (entitet.getIme().trim().length() < 2 || entitet.getIme().trim().length() > 30) {
            throw new EdunovaException("Ime osobe ne smije imati manje od 2 i više od 30 znakova");
        }
    }

    private void kontrolaMjesavina() throws EdunovaException {

    }

    private void kontrolaDob() throws EdunovaException {
        kontrolaDobNull();
        kontrolaDobNijeZnak();
    }

    private void kontrolaKilaza() throws EdunovaException {
        if (entitet.getKilaza() == null || entitet.getKilaza().compareTo(BigDecimal.ZERO) <= 0
                || entitet.getKilaza().compareTo(new BigDecimal(100)) == 1) {
            throw new EdunovaException("Kilaza psa mora biti postavljena" + " ,veća od 0 i manja od 100");
        }
    }

    private void kontrolaDobNijeZnak() throws EdunovaException {
        if (!(Pattern.matches("^[\\p{L} 0-9.'-]+$", entitet.getDob()))) {
            throw new EdunovaException("Obavezno unesite dob i dob ne smije biti znak");
        }

    }

    private void kontrolaPol() throws EdunovaException {
        kontrolaPolNull();
        kontrolaPolBoolean();
    }

    private void kontrolaDobNull() throws EdunovaException {
        if (entitet.getIme() == null) {
            throw new EdunovaException("Dob psa mora biti postavljen");
        }
    }

    private void kontrolaPolNull() throws EdunovaException {
        if (entitet.getIme() == null) {
            throw new EdunovaException("Pol psa mora biti postavljen");
        }
    }
    
    private void kontrolaDobObavezan()throws EdunovaException{
        if(entitet.getDob().trim().isEmpty()){
            throw new EdunovaException("Obavezno unesite dob psa!");
        }
    }
    

    private boolean kontrolaPolBoolean() throws EdunovaException {

        if (entitet.getPol().equals("M") || entitet.getPol().equals("Ž")) {
            return true;
        } else {
            throw new EdunovaException("Pol mora biti M ili Ž");
        }

    }
}
