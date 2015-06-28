package br.com.emanuelmm.contab.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.emanuelmm.contab.entity.Balanco;

@Named
@RequestScoped
public class BalancoBean {

	private Balanco balanco;
	
	private List < Balanco > balancos;
		
	public void cadastrar() {
		
	}
	
	public void remover() {
		
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
		
}
