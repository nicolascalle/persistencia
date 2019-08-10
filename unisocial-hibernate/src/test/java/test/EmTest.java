package test;

import db.EntityManagerHelper;
import entities.Aporte;
import entities.BuenaReputacion;
import entities.Reputacion;
import entities.Topico;
import entities.Usuario;
import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class EmTest{

	@Test
	public void primerTest() {
		Usuario eze = EntityManagerHelper.getEntityManager().find(Usuario.class, 1);
		System.out.println(eze.getNombre());
		
		Aporte unAporte = new Aporte();
		unAporte.setDescripcion("Aporte");
//		eze.setApellido("perez");
//		eze.setLegajo(512);
//		eze.setNombre("eze");
//		eze.setReputacion(new BuenaReputacion());
//		eze.setTelefono(45214);
//		eze.setFechaDeNacimiento(LocalDate.now());
//		
//		EntityManagerHelper.beginTransaction();
//		EntityManagerHelper.getEntityManager().remove(eze);
//		EntityManagerHelper.commit();
		
	}
	
	 /* @Test public void persistir1UsuarioTest(){ Usuario usuario = new Usuario();
	  usuario.setNombre("Eze"); usuario.setApellido("Escobar");
	  usuario.setTelefono(44889966); usuario.setLegajo(1527778);
	  usuario.setFechaDeNacimiento(LocalDate.of(1995,10,14));
	  
	  EntityManagerHelper.beginTransaction();
	  EntityManagerHelper.getEntityManager().persist(usuario);
	  EntityManagerHelper.commit(); }*/
	  
	  /*
	  @Test public void recuperandoAEze(){ Usuario eze = (Usuario)
	  EntityManagerHelper.createQuery("from Usuario where nombre = 'Eze'").
	  getSingleResult(); Assert.assertEquals("Eze", eze.getNombre()); }
	  
	  @Test public void persistir2Aporte(){ Topico topicoApunte = new Topico();
	  topicoApunte.setNombre("Apunte");
	  topicoApunte.setDescripcion("Colaboración de un apunte");
	  
	  EntityManagerHelper.beginTransaction();
	  EntityManagerHelper.getEntityManager().persist(topicoApunte);
	  EntityManagerHelper.commit();
	  
	  Aporte unAporte = new Aporte(); unAporte.setTopico(topicoApunte); Usuario eze
	  = (Usuario)
	  EntityManagerHelper.createQuery("from Usuario where nombre = 'Eze'").
	  getSingleResult(); unAporte.setUsuario(eze);
	  unAporte.setNombre("Apunte de diseño");
	  unAporte.setDescripcion("Taller ORM");
	  
	  EntityManagerHelper.beginTransaction();
	  EntityManagerHelper.getEntityManager().persist(unAporte);
	  EntityManagerHelper.commit(); }*/
	 
}
