package entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public abstract class Reputacion extends EntidadPersistente{

    public void recibirPuntuacionDeAporte(Puntuacion puntuacion, Usuario usuario){}

    public void chanceParaAportar(Usuario usuario){}
}
