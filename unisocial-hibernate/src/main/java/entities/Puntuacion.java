package entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Puntuacion extends EntidadPersistente {
	@ManyToOne @JoinColumn(name = "aporte_id")
    private Aporte aporte;
	@ManyToOne @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    private int puntos;
    private LocalDate fecha;

    public Puntuacion(int puntos, Usuario usuario){
        this.setUsuario(usuario);
        this.setPuntos(puntos);
        this.setFecha(LocalDate.now());
    }
    
    public Puntuacion() {
    	
    }

    public Aporte getAporte() {
        return aporte;
    }

    public void setAporte(Aporte aporte) {
        this.aporte = aporte;
        aporte.agregarPuntuacion(this);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    private void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getPuntos() {
        return puntos;
    }

    private void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    private void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}