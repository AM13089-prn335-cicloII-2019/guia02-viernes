/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.occ.edu.sv.ingenieria.prn335.guia02.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ues.occ.edu.sv.ingenieria.prn335.guia02.Entity.TipoPago;



/**
 *
 * @author beatriz
 */
@ExtendWith(MockitoExtension.class)
public class TipoPagoBeanTest {
    
    public TipoPagoBeanTest() {
    }
    
  @Test
  public void crearTest() throws Exception{
      System.out.println("crear");
     EntityManager mocKEM =Mockito.mock(EntityManager.class);
     EntityTransaction mockTX=Mockito.mock(EntityTransaction.class);
     Mockito.when(mocKEM.getTransaction()).thenReturn(mockTX);
      TipoPagoBean cut = new  TipoPagoBean();
      cut.em=mocKEM;
      TipoPago r= new TipoPago();
      r.setIdTipoPago(0);
      r.setTipoPago("algun atributo");
      r.setDescripcion("alguna descripcion");
      r.setActivo(false);
      cut.crear(r);
      Mockito.verify(mocKEM,Mockito.times(1)).persist( Mockito.any());
      
       //fail("esta prueba no pasa");
  }
  
  @Test
  public void ModificarTest() throws Exception{
      System.out.println("modificar");
     EntityManager mocKEM =Mockito.mock(EntityManager.class);
     EntityTransaction mockTX=Mockito.mock(EntityTransaction.class);
     Mockito.when(mocKEM.getTransaction()).thenReturn(mockTX);
      TipoPagoBean cut = new  TipoPagoBean();
      cut.em=mocKEM;
      TipoPago r= new TipoPago();
      r.setIdTipoPago(0);
      r.setTipoPago("algun atributo");
      r.setDescripcion("alguna descripcion");
      r.setActivo(false);
      cut.Modificar(r);
      Mockito.verify(mocKEM,Mockito.times(1)).merge(Mockito.any());
      
       //fail("esta prueba no pasa");
  }
  
  @Test
  public void EliminarTest() throws Exception{
      System.out.println("Eliminar");
     EntityManager mocKEM =Mockito.mock(EntityManager.class);
     EntityTransaction mockTX=Mockito.mock(EntityTransaction.class);
     Mockito.when(mocKEM.getTransaction()).thenReturn(mockTX);
      TipoPagoBean cut = new  TipoPagoBean();
      cut.em=mocKEM;
      TipoPago r= new TipoPago();
      r.setIdTipoPago(0);
      r.setTipoPago("algun atributo");
      r.setDescripcion("alguna descripcion");
      r.setActivo(false);
      cut.Eliminar(r);
      Mockito.verify(mocKEM,Mockito.times(1)).remove(Mockito.any());
      
       //fail("esta prueba no pasa");
  }
  
  @Test
  public void formatoTarjetaCreditoTest() throws Exception{
  
  System.out.println("formatoTarjetaCredito");
        String cadena = "";
        String marca = "";
        TipoPagoBean instance = new TipoPagoBean();
        String expResult = "";
        String result = instance.formatoTarjetaCredito(cadena, marca);
        assertEquals(expResult, result);
      
        //fail("no pasa");
    }
    
  
  }
  
  
  
  
  
  
  
  
    

