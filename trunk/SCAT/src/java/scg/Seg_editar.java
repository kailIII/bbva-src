package scg;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Seg_editar {
    
    
      private String segitem;
    public String getSegitem() {
        return segitem;
    }
    public void setSegitem(String segitem) {
        this.segitem = segitem;
        }
    
    private String seg;
    public String getSeg() {
        return seg;
    }
    public void setSeg(String seg) {
        this.seg = seg;
    }
    
       private String segreg;
    public String getSegreg() {
        return segreg;
    }
    public void setSegreg(String segreg) {
        this.segreg = segreg;
        }
    
     private String segestsol;
    public String getEstsol() {
        return segestsol;
    }
    public void setEstsol(String segestsol) {
        this.segestsol = segestsol;
        }
    
     private String segguia;
    public String getGuia() {
        return segguia;
    }
    public void setGuia(String segguia) {
        this.segguia = segguia;
        }
    
}
