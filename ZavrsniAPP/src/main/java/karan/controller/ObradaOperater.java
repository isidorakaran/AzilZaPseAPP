/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karan.controller;

import java.util.List;
import karan.model.Operater;
import karan.util.EdunovaException;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author WinUSER
 */
public class ObradaOperater extends Obrada<Operater>{

    @Override
    public List<Operater> read() {
        return session.createQuery("from Operater",Operater.class).list();
    }
    
    

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void unosAdminOperater()throws EdunovaException{
        Operater o=new Operater();
        o.setIme("Admin");
        o.setPrezime("Operater");
        o.setEmail("karanisidora@gmail.com");
        o.setOib("09403302317");
        o.setLozinka(BCrypt.hashpw("karan", BCrypt.gensalt()).toCharArray());
        
        entitet=o;
        create();
        
    }
    
}
