/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karan.controller;

import java.util.List;
import karan.model.Pas;
import karan.util.EdunovaException;

/**
 *
 * @author WinUSER
 */
public class ObradaPas extends Obrada<Pas>{

    @Override
    public List<Pas> read() {
        return session.createQuery("from Pas", Pas.class).list();
    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        kontrolaMjesavina();
        kontrolaIme();
        kontrolaDob();
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
        kontrolaIme();
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
    }

    private void kontrolaIme() throws EdunovaException{
        kontrolaImeNull();
        kontrolaImeNijeBroj();
        kontrolaImeNijeZnak();
        kontrolaImeMinIMaxDuzina();
    }

    private void kontrolaImeNijeBroj() throws EdunovaException{
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

    private void kontrolaImeNijeZnak() throws EdunovaException{
         for (int i = 0; i < entitet.getIme().length(); i++) {
            if (Character.isLetter(entitet.getIme().charAt(i))) {
                continue;
            } else {
                throw new EdunovaException("Ime ne smije sadržavati znakove niti brojeve");
            }
        }
    }

    private void kontrolaImeNull() throws EdunovaException{
        if (entitet.getIme() == null) {
            throw new EdunovaException("Ime mora biti postavljeno");
        }
    }

    private void kontrolaImeMinIMaxDuzina() throws EdunovaException{
          if (entitet.getIme().trim().length() < 2 || entitet.getIme().trim().length() > 30) {
            throw new EdunovaException("Ime osobe ne smije imati manje od 2 i više od 30 znakova");
        }
    }

    private void kontrolaMjesavina() throws EdunovaException{
        
    }

    private void kontrolaDob() throws EdunovaException{
        
    }
    
}
