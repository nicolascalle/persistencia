package entities;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
@Entity
public class Rol extends EntidadPersistente{
    private String nombre;
    @ManyToMany
    private List<Permiso> permisos;

    public Rol(){
        this.permisos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}