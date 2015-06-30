package br.com.emanuelmm.contab.business;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import br.com.emanuelmm.contab.entity.Balanco;
import br.com.emanuelmm.contab.entity.Empresa;

@Transactional
public class BalancoBusiness {

	@PersistenceContext
	EntityManager em;
	
	@Inject
	EmpresaBusiness empresaBusiness;
	
	public void salvar(Balanco balanco) {
		em.persist(balanco);
	}
	
	public List < Balanco > consultarBalancos() {
		return em.createQuery("from Balanco order by 1 desc", Balanco.class).getResultList();
	}
	
	public void remover(Balanco balanco) {
		Object referencia = this.em.getReference(Balanco.class, balanco.getId());
		em.remove(referencia);	
	}	
	
	public List <Empresa> consultarEmpresas() {
		return empresaBusiness.consultarEmpresas();
	}
}