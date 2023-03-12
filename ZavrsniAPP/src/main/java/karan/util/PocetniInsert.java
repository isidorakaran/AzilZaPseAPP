/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karan.util;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import karan.model.Osoba;
import karan.model.Pas;
import karan.model.Transakcija;
import karan.model.VrstaTransakcije;
import org.hibernate.Session;

/**
 *
 * @author WinUSER
 */
public class PocetniInsert {
    
    private static int BROJ_OSOBA=20;
    private static int BROJ_PASA=50;
    private static int BROJ_TRANSAKCIJA=50;
    private static int BROJ_VRSTATRANSAKCIJE=2;

    private Faker faker;
    private List<Osoba> osobe;
    private List<Pas> psi;
    private List<Transakcija> transakcije;
    private List<VrstaTransakcije> vrsteTransakcije;
    private Session session;

    public PocetniInsert() {
        faker = new Faker();
        osobe = new ArrayList<>();
        psi = new ArrayList<>();
        transakcije = new ArrayList<>();
        vrsteTransakcije = new ArrayList<>();
        session=HibernateUtil.getsesSession();
        session.beginTransaction();
        kreirajOsobe();
        kreirajVrsteTransakcije();
        kreirajTransakcije();
        kreirajPse();
        
        session.getTransaction().commit();
    }

    private void kreirajOsobe() {
        Osoba o;
        for(int i=0;i<BROJ_OSOBA;i++){
            o=new Osoba();
            o.setIme(faker.name().firstName());
            o.setPrezime(faker.name().lastName());
            o.setEmail(faker.internet().emailAddress());
            o.setBrojTelefona(faker.internet().ipV6Address());
            session.persist(o);
            osobe.add(o);
        }
        
    }

    private void kreirajVrsteTransakcije() {
          VrstaTransakcije vt;
        for(int i=0;i<BROJ_VRSTATRANSAKCIJE;i++){
            vt=new VrstaTransakcije();
            vt.setNaziv(faker.name().prefix());
            session.persist(vt);
            vrsteTransakcije.add(vt);
        }
    }

    private void kreirajTransakcije() {
         Transakcija t;
        for(int i=0;i<BROJ_TRANSAKCIJA;i++){
            t=new Transakcija();
            t.setDatum(faker.date().birthday());
            t.setOpis(faker.harryPotter().quote());
            t.setNapomena(faker.lordOfTheRings().character());
            t.setOsoba(osobe.get(sb(0,BROJ_OSOBA-1)));
            t.setVrstaTransakcije(vrsteTransakcije.get(sb(0, BROJ_VRSTATRANSAKCIJE - 1)));
            session.persist(t);
            transakcije.add(t);
    }
    
   
    
}
    private void kreirajPse() {
        Pas p;
        List<Transakcija> t;
        for(int i=0;i<BROJ_PASA;i++){
            p=new Pas();
            p.setIme(faker.dog().name());
            p.setDob(faker.number().randomDigitNotZero());
            //p.setKilaza(faker.number().);
            p.setMjesavina(faker.bool().bool());
            p.setPol(faker.dog().gender());
            t=new ArrayList<>();
            for(int j=0;j<sb(1, 2);j++){
                t.add(transakcije.get(sb(0, BROJ_TRANSAKCIJA-1)));
            }
            p.setTransakcije(t);
            session.persist(p);
            
        }
    }
    
    
    
    
    private int sb(int min,int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    
}