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
    
}
