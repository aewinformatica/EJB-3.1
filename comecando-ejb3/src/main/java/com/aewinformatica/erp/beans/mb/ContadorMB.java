package com.aewinformatica.erp.beans.mb;
  
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.aewinformatica.erp.beans.ContadorBean;
  
@ManagedBean
@SessionScoped
public class ContadorMB {
       
      @EJB
      ContadorBean contadorBean;
       
      public void incrementar() {
            contadorBean.incrementar();
      }
       
      public int getContador() {
            return contadorBean.getContador();
      }
}