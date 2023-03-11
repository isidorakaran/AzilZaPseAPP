/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karan.util;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author WinUSER
 */
public class HibernateUtil {
     private static Session session=null;
    protected HibernateUtil(){
        
    }
    
    public static Session getsesSession(){
        if(session==null){
            session= new Configuration().configure().buildSessionFactory().openSession();
        }
        return session;
    }
    
}
