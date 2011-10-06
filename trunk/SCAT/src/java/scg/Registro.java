package scg;

import java.util.ArrayList;
import java.util.Collection;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Registro {

    
    
    private Collection<Seg_editar> seg_editar;
    public Collection<Seg_editar> getSeg_editar() {
        return seg_editar;
    }
    public void setSeg_editar(Collection<Seg_editar> seg_editar) {
        this.seg_editar = seg_editar;
    }
    
    
    private Collection<Comprobante> comprobante;
    public Collection<Comprobante> getComprobante() {
        return comprobante;
    }
    public void setComprobante(Collection<Comprobante> comprobante) {
        this.comprobante = comprobante;
    }
    
      private Collection<Stock_b> stock_b;
    public Collection<Stock_b> getStock_b() {
        return stock_b;
    }
    public void setStock_b(Collection<Stock_b> stock_b) {
        this.stock_b = stock_b;
    }
    
    
    public Registro() {
       
        this.comprobante = new ArrayList<Comprobante>();
      
        
        Comprobante c1 = new Comprobante();
        c1.setCuentagps("0");
        c1.setItem("00000001");
        
        this.comprobante.add(c1);
        
       
         
        
        Comprobante c5 = new Comprobante();  
        c5.setCuentagps("0");
         c5.setItem("00000002");
        this.comprobante.add(c5);
        
        
                
        
        Comprobante c6 = new Comprobante();  
        c6.setCuentagps("1");
        c6.setItem("00000003");
        this.comprobante.add(c6);
        
                
        Comprobante c14 = new Comprobante();
        c14.setCuentagps("0");
          c14.setItem("00000004");
        this.comprobante.add(c14);
      
        
        Comprobante c4 = new Comprobante();  
        c4.setCuentagps("5");
         c4.setItem("00000005");
        this.comprobante.add(c4);
        
       
         Comprobante c10 = new Comprobante();  
          c10.setDife("0");
        this.comprobante.add(c10);
        
          
        
        this.seg_editar = new ArrayList<Seg_editar>();
          
        
        
        
        Seg_editar c20 = new Seg_editar();  
          c20.setSeg("Registrado");
          c20.setSegitem("001");
            c20.setEstsol("Emitido");
            c20.setGuia("GUIA0001");
        this.seg_editar.add(c20);
        
                     
        Seg_editar c21 = new Seg_editar();  
          c21.setSeg("Enviado");
          c21.setSegitem("002");
          c21.setEstsol("Habilitado");
            c21.setGuia("GUIA0001");
        this.seg_editar.add(c21);
        
        
       
         Seg_editar c22 = new Seg_editar();  
         c22.setSeg("Generado");
         c22.setSegitem("003");
         c22.setEstsol("Despachado");
           c22.setGuia("GUIA0001");
        this.seg_editar.add(c22);
       
              
        Seg_editar c23 = new Seg_editar();  
          c23.setSeg("Regularizado");
          c23.setSegitem("004");
          c23.setSegreg("Pagar pieza");
          c23.setEstsol("En Proceso");
            c23.setGuia("GUIA0001");
        this.seg_editar.add(c23);
        
                
        
          Seg_editar c24 = new Seg_editar();  
         c24.setSeg("Subsanado");
          c24.setSegitem("005");
          c24.setEstsol("Habilitado");
            c24.setGuia("GUIA0002");
        this.seg_editar.add(c24);
       
              
        Seg_editar c25 = new Seg_editar();  
         
          c25.setSegitem("006");
            c25.setEstsol("Despachado");
              c25.setGuia("GUIA0002");
        this.seg_editar.add(c25);
        
         Seg_editar c26 = new Seg_editar();  
       
          c26.setSegitem("007");
            c26.setEstsol("En proceso");
              c26.setGuia("GUIA0002");
        this.seg_editar.add(c26);
        
        Seg_editar c99 = new Seg_editar();  
       
          c99.setSegitem("008");
            c99.setEstsol("Finalizado");
              c99.setGuia("GUIA0002");
        this.seg_editar.add(c99);
        
        this.stock_b = new ArrayList<Stock_b>();
        
            Stock_b c27 = new Stock_b();  
            c27.setBandeja("TV");  
             c27.setItem("001");
             c27.setRol("Administrador");
             c27.setName("Cynthia Vargas Días");
             c27.setCantidad("50");
             c27.setCod("PQ256");
             c27.setCom("0");
              c27.setEstguia("Entregado");
                  c27.setTipoNoConf("Observado");
            this.stock_b.add(c27);
                       
                   
            Stock_b c28 = new Stock_b();  
            c28.setBandeja("Ipad");  
               c28.setItem("002");
               c28.setRol("Gestor");
               c28.setName("Carlos Guzman Torres");
             c28.setCantidad("50");
             c28.setCod("PQ257");
              c28.setCom("2");
              c28.setEstguia("No recibido");
              c28.setTipoNoConf("Faltante");
            this.stock_b.add(c28);
            
                          
            Stock_b c29= new Stock_b();  
            c29.setBandeja("Licuadora"); 
                c29.setItem("003");
                     c29.setRol("Controlador");
                     c29.setName("Rengifo Estrada Flores");
             c29.setCantidad("50");
             c29.setCod("PQ258");
              c29.setCom("0");
              c29.setEstguia("Regularizado");
            this.stock_b.add(c29);
            
            
                                
            Stock_b c30= new Stock_b();  
            c30.setBandeja("canasta"); 
            c30.setItem("004");
                 c30.setRol("Generador Menor");
                 c30.setName("Gabril Zaciga Barreda");
                    c30.setName1("Carlos Peñaranda");
             c30.setCantidad("50");
             c30.setCod("PQ258");
              c30.setCom("0");
             
            this.stock_b.add(c30);
            
               Stock_b c31= new Stock_b();  
            c31.setBandeja("Horno"); 
            c31.setItem("005");
            c31.setRol("Generador Mayor");
          
            c31.setName("Julio Zaciga Barreda");
             c31.setCantidad("50");
             c31.setCod("PQ260");
              c31.setCom("0");
            this.stock_b.add(c31);
            
             Stock_b c32= new Stock_b();  
            c32.setBandeja("Bicicleta"); 
            c32.setItem("006");
             
             c32.setCantidad("50");
             c32.setCod("PQ265");
              c32.setCom("0");
            this.stock_b.add(c32);
    }
}
