package scg;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Comprobante {
    
    
    
     private String cuentagps;
    public String getCuentagps() {
        return cuentagps;
    }
    public void setCuentagps(String cuentagps) {
        this.cuentagps = cuentagps;
    }
     
    private String item;
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    
        private String dife;
    public String getDife() {
        return dife;
    }
    public void setDife(String dife) {
        this.dife = dife;
    }
   
    
  
    
    
    
}
