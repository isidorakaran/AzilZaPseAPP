/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karan.controller;

import java.util.List;
import karan.model.VrstaTransakcije;
import karan.util.EdunovaException;

/**
 *
 * @author WinUSER
 */
public class ObradaVrstaTransakcije extends Obrada<VrstaTransakcije>{

    @Override
    public List<VrstaTransakcije> read() {
        return session.createQuery("from VrstaTransakcije", VrstaTransakcije.class).list();
    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        kontrolaNaziv();
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
        kontrolaNaziv();
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
    }

    private void kontrolaNaziv() throws EdunovaException {
         kontrolaNazivNull();
        kontrolaNazivNijeBroj();
        kontrolaNazivNijeZnak();
        KontrolaNazivMinIMaxDuzina();
    }

    private void kontrolaNazivNijeBroj() throws EdunovaException{
        boolean broj = false;
        try {
            Double.parseDouble(entitet.getNaziv());
            broj = true;
        } catch (Exception e) {
        }
        if (broj) {
            throw new EdunovaException("Ne smijete unositi znakove niti brojeve");
        }
    }

    private void kontrolaNazivNull() throws EdunovaException{
         if (entitet.getNaziv()== null) {
            throw new EdunovaException("Ne smijete ostaviti prazno");
        }
    }

    private void kontrolaNazivNijeZnak() throws EdunovaException{
         for (int i = 0; i < entitet.getNaziv().length(); i++) {
            if (Character.isLetter(entitet.getNaziv().charAt(i))) {
                continue;
            } else {
                throw new EdunovaException("Ne smijete unositi znakove niti brojeve");
            }
        }
    }

    private void KontrolaNazivMinIMaxDuzina() throws EdunovaException{
                if (entitet.getNaziv().trim().length() < 2 || entitet.getNaziv().trim().length() > 4) {
            throw new EdunovaException("Naziv mora sadržavati najmanje 2 slova i najviše tri(in ili out)");
        }
    }
    
    
    
}
