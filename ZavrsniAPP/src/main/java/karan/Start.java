/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package karan;

//import karan.util.HibernateUtil;
import karan.controller.ObradaOsoba;
import karan.controller.ObradaVrstaTransakcije;
import karan.model.Osoba;
import karan.model.VrstaTransakcije;
import karan.util.EdunovaException;
import karan.util.PocetniInsert;

/**
 *
 * @author WinUSER
 */
public class Start {

    public static void main(String[] args) {
       // HibernateUtil.getsesSession();
       new PocetniInsert();
       
      /*ObradaOsoba oo=new ObradaOsoba();
        
        Osoba osoba=new Osoba();
        osoba.setBrojTelefona("1972345432");
        oo.setEntitet(osoba);
        
        try {
            oo.create();
        } catch (EdunovaException e) {
            System.out.println(e.getPoruka());
        }
        
        for(Osoba o:oo.read()){
            System.out.println(o.getBrojTelefona());
        }
        */
      
     /*
      
        ObradaVrstaTransakcije ovt=new ObradaVrstaTransakcije();
        for(VrstaTransakcije vt: ovt.read()){
            System.out.println(vt.getNaziv());
        }
         
      VrstaTransakcije vrstat=new VrstaTransakcije();
      vrstat.setNaziv("drugi preko kontrolera");
      ovt.setEntitet(vrstat);
        try {
            ovt.create();
        } catch (EdunovaException e) {
            System.out.println(e.getPoruka());
        }
        */
       
       
    }
}
