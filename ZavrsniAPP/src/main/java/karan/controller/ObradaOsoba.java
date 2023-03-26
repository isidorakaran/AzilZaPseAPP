/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karan.controller;

import java.util.List;

import karan.model.Osoba;
import karan.util.Alati;
import karan.util.EdunovaException;

/**
 *
 * @author WinUSER
 */
public class ObradaOsoba extends Obrada<Osoba> {

    @Override
    public List<Osoba> read() {
        return session.createQuery("from Osoba", Osoba.class).list();
    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        kontrolaBrojTelefona();
        kontrolaEmail();
        kontrolaIme();
        kontrolaPrezime();

    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
        kontrolaBrojTelefona();
        kontrolaEmail();
        kontrolaIme();
        kontrolaPrezime();

    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
    }

    private void kontrolaIme() throws EdunovaException {
        kontrolaImeNull();
        kontrolaImeNijeZnak();
        kontrolaImeNijeBroj();
        KontrolaImeMinIMaxDuzina();
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

    private void KontrolaImeMinIMaxDuzina() throws EdunovaException {
        if (entitet.getIme().trim().length() < 2 || entitet.getIme().trim().length() > 50) {
            throw new EdunovaException("Ime osobe ne smije imati manje od 2 i više od 50 znakova");
        }
    }

    private void kontrolaImeNull() throws EdunovaException {
        if (entitet.getIme() == null) {
            throw new EdunovaException("Ime mora biti postavljeno");
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

    private void kontrolaPrezime() throws EdunovaException {
        kontrolaPrezimeNull();
        kontrolaPrezimeNijeZnak();
        kontrolaPrezimeNijeBroj();
        KontrolaPrezimeMinIMaxDuzina();
    }

    private void kontrolaPrezimeNull() throws EdunovaException {
        if (entitet.getPrezime() == null) {
            throw new EdunovaException("Prezime mora biti postavljeno");
        }
    }

    private void kontrolaPrezimeNijeZnak() throws EdunovaException {
        for (int i = 0; i < entitet.getPrezime().length(); i++) {
            if (Character.isLetter(entitet.getPrezime().charAt(i))) {
                continue;
            } else {
                throw new EdunovaException("Prezime ne smije sadržavati znakove niti brojeve");
            }
        }
    }

    private void kontrolaPrezimeNijeBroj() throws EdunovaException {
        boolean broj = false;
        try {
            Double.parseDouble(entitet.getPrezime());
            broj = true;
        } catch (Exception e) {
        }
        if (broj) {
            throw new EdunovaException("Prezime ne smije biti broj niti znak");
        }
    }

    private void KontrolaPrezimeMinIMaxDuzina() throws EdunovaException {
        if (entitet.getPrezime().trim().length() < 2 || entitet.getPrezime().trim().length() > 50) {
            throw new EdunovaException("Prezim osobe ne smije imati manje od 2 i više od 50 znakova");
        }
    }

    private void kontrolaEmail() throws EdunovaException {
        if (!Alati.isValid(entitet.getEmail())) {
            throw new EdunovaException("E-mail nije u dobrom formatu");
        }
    }

    private void kontrolaBrojTelefona() throws EdunovaException {
        if (!Alati.validanBrojTelefona(entitet.getBrojTelefona())) {
            throw new EdunovaException("Broj telefona nije u dobrom formatu");
        }
    }

}
