/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package karan;

//import karan.util.HibernateUtil;
import java.math.BigDecimal;
import karan.controller.ObradaOperater;
import karan.controller.ObradaOsoba;
import karan.controller.ObradaPas;
import karan.controller.ObradaTransakcija;
import karan.controller.ObradaVrstaTransakcije;
import karan.model.Osoba;
import karan.model.Pas;
import karan.model.Transakcija;
import karan.model.VrstaTransakcije;
import karan.util.EdunovaException;
import karan.util.PocetniInsert;
import karan.view.SplashScreen;

/**
 *
 * @author WinUSER
 */
public class Start {

    public static void main(String[] args) {
       // HibernateUtil.getsesSession();
   //new PocetniInsert();
 new SplashScreen().setVisible(true);
  
  /*    ObradaOperater oo=new ObradaOperater();
        oo.unosAdminOperater();*/
   
       
     /* ObradaOsoba oo=new ObradaOsoba();
        
        Osoba osoba=new Osoba();
        osoba.setIme("Isi");
        oo.setEntitet(osoba);
        
        try {
            oo.create();
        } catch (EdunovaException e) {
            System.out.println(e.getPoruka());
        }
        
        for(Osoba o:oo.read()){
            System.out.println(o.getBrojTelefona());
        }*/
        
    /*ObradaVrstaTransakcije ovt=new ObradaVrstaTransakcije();   
      VrstaTransakcije vrstat=new VrstaTransakcije();
      vrstat.setNaziv("A");
      ovt.setEntitet(vrstat);
        try {
            ovt.create();
        } catch (EdunovaException e) {
            System.out.println(e.getPoruka());
        }
       
        for(VrstaTransakcije vt: ovt.read()){
            System.out.println(vt.getNaziv());
       
    }*/
   
      /*  ObradaTransakcija ot=new ObradaTransakcija();
        
        
        Transakcija transakcija=new Transakcija();
        transakcija.setNapomena(null);
        ot.setEntitet(transakcija);
        try {
            ot.create();
        } catch (EdunovaException e) {
            System.out.println(e.getPoruka());
        }
        for(Transakcija t:ot.read()){
            System.out.println(t.getNapomena());
        }*/
        /*ObradaPas op=new ObradaPas();
        Pas pas=new Pas();
        pas.setPol("Male");
        op.setEntitet(pas);
        try {
            op.create();
        } catch (EdunovaException e) {
            System.out.println(e.getPoruka());
        }
        for(Pas p:op.read()){
            System.out.println(p.getPol());
        }*/
   
    }
}
