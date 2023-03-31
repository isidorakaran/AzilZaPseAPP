/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karan.controller;

import jakarta.persistence.NoResultException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        return session.createQuery("from Operater ",Operater.class).list();
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

    public void unosAdminOperater(){
        Operater o=new Operater();
        o.setIme("Isidora");
        o.setPrezime("Karan");
        o.setEmail("karanisidora@gmail.com");
        o.setOib("09403302317");
        o.setLozinka(BCrypt.hashpw("1111", BCrypt.gensalt()).toCharArray());
        
        entitet=o;
        try {
            create();
        } catch (EdunovaException ex) {
            System.out.println(ex.getPoruka());
        }
        
    }
    
     public Operater autoriziraj(String email,char [] lozinka){
         Operater o;
        try {
           o=session.createQuery("from Operater o where o.email=:email", Operater.class)
                   .setParameter("email", email).getSingleResult();
        } catch (NoResultException e) {
        return null;
        }
        
        if(BCrypt.checkpw(new String(lozinka),new String(o.getLozinka()))){
            return o;
        }
        
        return null;
    }
    
    
}
