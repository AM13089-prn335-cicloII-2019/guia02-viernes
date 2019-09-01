/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.occ.edu.sv.ingenieria.prn335.guia02.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import ues.occ.edu.sv.ingenieria.prn335.guia02.Entity.TipoPago;

/**
 *
 * @author beatriz
 */
public class TipoPagoBean {
    
    
    
    protected EntityManager em;
    final static EntityManagerFactory EMF=Persistence.createEntityManagerFactory("cinePU");
    
    public void iniciarEm(){
      this.em=EMF.createEntityManager();
    }
    
    
    public EntityTransaction getTx(){
    if(this.em!=null){
    return this.em.getTransaction();
    }
    return null;
    }
    
    public void crear(TipoPago r){
    EntityTransaction tx=this.em.getTransaction();
    tx.begin();
    this.em.persist(r);
    tx.commit();
    }
    
    public void Modificar(TipoPago r){
    EntityTransaction tx=this.em.getTransaction();
    tx.begin();
    this.em.merge(r);
    tx.commit();
    
    }
    
    public void Eliminar(TipoPago r){
    EntityTransaction tx=this.em.getTransaction();
    tx.begin();
    this.em.remove(r);
    tx.commit();
    
    }
    public String formatoTarjetaCredito(String cadena, String marca){
       int index = 0;
    StringBuilder formatoTarjeta = new StringBuilder();
    for (int i = 0; i < marca.length(); i++) {
        char c = marca.charAt(i);
        if (c == '#') {
            formatoTarjeta.append(cadena.charAt(index));
            index++;
        } else if (c == 'x') {
            formatoTarjeta.append(c);
            index++;
        } else {
            formatoTarjeta.append(c);
             
        }
        
    }

   
        return formatoTarjeta.toString();
}
  
    
    
   
    
}
