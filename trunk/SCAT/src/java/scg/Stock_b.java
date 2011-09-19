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
    
        
        private String rol;
        public String getRol()
        {
        return rol;
        }
        public void setRol (String rol) 
        {
        this.rol = rol;
        }
        
              private String name;
        public String getName()
        {
        return name;
        }
        public void setName (String name) 
        {
        this.name = name;
        }
          private String name1;
        public String getName1()
        {
        return name1;
        }
        public void setName1 (String name1) 
        {
        this.name1 = name1;
        }
        
                private String estguia;
        public String getEstguia()
        {
        return estguia;
        }
        public void setEstguia (String estguia) 
        {
        this.estguia = estguia;
        }
}

