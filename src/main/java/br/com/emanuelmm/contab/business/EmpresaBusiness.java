package br.com.emanuelmm.contab.business;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import br.com.emanuelmm.contab.entity.Empresa;

@Transactional
public class EmpresaBusiness {
	
	@PersistenceContext
	EntityManager em;
	
	public void salvar(Empresa empresa) {
		em.persist(empresa);
	}
	
	public List <Empresa> consultarEmpresas(){
		return em.createQuery("from Empresa", Empresa.class).getResultList();
	}
	
	public Empresa buscarEmpresaPorId(long id) {
		return em.find(Empresa.class, id);
	}

	public void remover(Empresa empresa) {
		Object referencia = this.em.getReference(Empresa.class, empresa.getId());
		em.remove(referencia);	
	}
}
