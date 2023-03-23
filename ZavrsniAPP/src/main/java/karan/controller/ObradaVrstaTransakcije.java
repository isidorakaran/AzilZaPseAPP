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
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
    }
    
    
    
}
