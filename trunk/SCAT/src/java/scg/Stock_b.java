package scg;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Stock_b {
    
    
        private String bandeja;
        public String getBandeja()
        {
        return bandeja;
        }
        public void setBandeja(String bandeja) 
        {
        this.bandeja = bandeja;
        }
    

               private String item;
        public String getItem()
        {
        return item;
        }
        public void setItem(String item) 
        {
        this.item = item;
        }
        
        
        
            
        private String cod;
        public String getCod()
        {
        return cod;
        }
        public void setCod(String cod) 
        {
        this.cod = cod;
        }
    

               private String cantidad;
        public String getCantidad()
        {
        return cantidad;
        }
        public void setCantidad (String cantidad) 
        {
        this.cantidad = cantidad;
        }
        
                    private String com;
        public String getCom()
        {
        return com;
        }
        public void setCom (String com) 
        {
        this.com = com;
        }
    
}
