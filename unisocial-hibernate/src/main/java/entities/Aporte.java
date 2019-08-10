package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
public class Aporte extends EntidadPersistente{
	@ManyToOne @JoinColumn(name = "usuario_id")
    private Usuario usuario;
	@ManyToOne @JoinColumn(name="topico_id")
    private Topico topico;
    private String nombre;
    private String descripcion;
    @OneToMany(mappedBy = "aporte")
    private List<Puntuacion> puntuaciones;
    @OneToMany @JoinColumn(name="aporte_id")
    private List<Archivo> archivos;

    public Aporte(){
        this.puntuaciones = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Topico getTopico() {
        return topico;
    }

    public void setTopico(Topico topico) {
        this.topico = topico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void agregarPuntuacion(Puntuacion puntuacion){
        this.puntuaciones.add(puntuacion);
        this.usuario.recibirPuntuacionDeAporte(puntuacion);
    }

    public int sumatoriaDePuntuaciones(){
        return this.puntuaciones.stream().mapToInt(p -> p.getPuntos()).sum();
    }
}