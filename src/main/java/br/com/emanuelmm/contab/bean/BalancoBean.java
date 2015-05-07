package br.com.emanuelmm.contab.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.emanuelmm.contab.entity.Balanco;

@Named
@RequestScoped
public class BalancoBean {

	private Balanco balanco;
	
	public void cadastrar() {
		
	}

	public Balanco getBalanco() {
		return balanco;
	}

	public void setBalanco(Balanco balanco) {
		this.balanco = balanco;
	}
	
	
	
		
}
