/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karan.controller;

import java.util.List;
import karan.model.VrstaTransakcije;
import karan.util.Alati;
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
       
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
    }

    private void kontrolaNaziv() throws EdunovaException {
       kontrolaNazivNull();
       kontrolaNazivObavezan();
       kontrolaNazivNijeBroj();
    }
    
    private void kontrolaNazivObavezan() throws EdunovaException{
        if(entitet.getNaziv().trim().isEmpty()){
            throw new EdunovaException("Obavezno unesite vrstu razmjene!");
        }
    
    }

    private void kontrolaNazivNijeBroj() throws EdunovaException{
        boolean broj = false;
        try {
            Double.parseDouble(entitet.getNaziv());
            broj = true;
        } catch (Exception e) {
        }
        if (broj) {
            throw new EdunovaException("Ne smijete unositi brojeve");
        }
    }

    private void kontrolaNazivNull() throws EdunovaException{
         if (entitet.getNaziv()== null) {
            throw new EdunovaException("Ne smijete ostaviti prazno");
        }
    }


   
    
    
    
}
