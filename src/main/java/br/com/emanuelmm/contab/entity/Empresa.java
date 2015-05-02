package br.com.emanuelmm.contab.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Empresa {

	@Id
	@GeneratedValue
	private Long id;
	
	private String cnpj;
	
	private String nomeFantasia;
	
	private String razaoSocial;
	
	@OneToMany(mappedBy="empresa", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List < Balanco > balancos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public List<Balanco> getBalancos() {
		return balancos;
	}

	public void setBalancos(List<Balanco> balancos) {
		this.balancos = balancos;
	}
			
}
