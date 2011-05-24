package bbva;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.event.ActionEvent;

@Named(value = "crearRequerimiento")
@SessionScoped
public class CrearRequerimiento implements Serializable {
    
    private String tipoItem;
    public String getTipoItem() { return tipoItem; }
    public void setTipoItem(String tipoItem) { this.tipoItem = tipoItem; }
    private Boolean mostrarCaracteristicas = false;
    public Boolean getMostrarCaracteristicas() { return mostrarCaracteristicas; }
    public void setMostrarCaracteristicas(Boolean verCaracteristicas) { this.mostrarCaracteristicas = verCaracteristicas; }
    private String marca;
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }    
    private String modelo;
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void habilitarCaracteristicas(ActionEvent e) {
        if ("Bien".equals(this.tipoItem))
            this.mostrarCaracteristicas = true;
        else
            this.mostrarCaracteristicas = false;
    }
    
    private String naturaleza = "";
    public String getNaturaleza() { return naturaleza; }
    public void setNaturaleza(String naturaleza) { this.naturaleza = naturaleza; }
    private Boolean mostrarActivo = false;
    public Boolean getMostrarActivo() { return mostrarActivo; }
    public void setMostrarActivo(Boolean mostrarActivo) { this.mostrarActivo = mostrarActivo; }
    public void habilitarActivo(ActionEvent e) {
        if ("Inversion".equals(this.naturaleza))
            this.mostrarActivo = true;
        else
            this.mostrarActivo = false;
    }
    
}
