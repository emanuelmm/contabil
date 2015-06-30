package br.com.emanuelmm.contab.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.emanuelmm.contab.business.BalancoBusiness;
import br.com.emanuelmm.contab.entity.Balanco;
import br.com.emanuelmm.contab.entity.Empresa;

@Named
@RequestScoped
public class BalancoBean {
	
	@Inject
	BalancoBusiness business;

	private Balanco balanco;
	
	private List < Balanco > balancos;
	private List < Empresa > empresas;
	
	private Empresa selectedEmpresa;
			
	@PostConstruct
	public void inicializar() {
		selectedEmpresa = new Empresa();
		balanco = new Balanco();
		empresas = business.consultarEmpresas();
		consultarTodos();		
	}
	
	public List <Balanco> consultarTodos() {
		return business.consultarBalancos();
	}
			
	public void cadastrar() {
		balanco.setEmpresa(selectedEmpresa);
		business.salvar(balanco);
		consultarTodos();
	}
	
	public void remover() {
		
	}

	public BalancoBusiness getBusiness() {
		return business;
	}

	public void setBusiness(BalancoBusiness business) {
		this.business = business;
	}

	public Balanco getBalanco() {
		return balanco;
	}

	public void setBalanco(Balanco balanco) {
		this.balanco = balanco;
	}

	public List<Balanco> getBalancos() {
		return balancos;
	}

	public void setBalancos(List<Balanco> balancos) {
		this.balancos = balancos;
	}

	public List<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}

	public Empresa getSelectedEmpresa() {
		return selectedEmpresa;
	}

	public void setSelectedEmpresa(Empresa selectedEmpresa) {
		this.selectedEmpresa = selectedEmpresa;
	}

	
	
}
