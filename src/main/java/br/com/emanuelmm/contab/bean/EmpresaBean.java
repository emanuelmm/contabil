package br.com.emanuelmm.contab.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.emanuelmm.contab.business.EmpresaBusiness;
import br.com.emanuelmm.contab.entity.Empresa;

@Named
@RequestScoped
public class EmpresaBean {

	List <Empresa> empresas;
	
	private Empresa empresa;
	
	@Inject 
	EmpresaBusiness business;

	@PostConstruct
	public void inicializar() {
		empresa = new Empresa();
		consultarTodos();
		
	}
	
	public void cadastrar() {
		business.salvar(empresa);

		consultarTodos();
	}
	
	public void remover() {
		business.remover(empresa);
		consultarTodos();
	}
	
	public void consultarTodos() {		
		empresas = business.consultarEmpresas();
		
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}

	
	
	
	
}
