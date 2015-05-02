package br.com.emanuelmm.contab.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Balanco {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="empresa")
	private Empresa empresa;
		
	private BigDecimal caixaBancos;
	private BigDecimal duplicatasReceber;
	private BigDecimal estoquesTotal;
	
	private BigDecimal moveisUtensilios;
	private BigDecimal veiculos;
	private BigDecimal maquinasEquipamentos;
	private BigDecimal depreciacao;
	
	private Date ano;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public BigDecimal getCaixaBancos() {
		return caixaBancos;
	}
	
	public void setCaixaBancos(BigDecimal caixaBancos) {
		this.caixaBancos = caixaBancos;
	}
	
	public BigDecimal getDuplicatasReceber() {
		return duplicatasReceber;
	}
	
	public void setDuplicatasReceber(BigDecimal duplicatasReceber) {
		this.duplicatasReceber = duplicatasReceber;
	}
	
	public BigDecimal getEstoquesTotal() {
		return estoquesTotal;
	}
	
	public void setEstoquesTotal(BigDecimal estoquesTotal) {
		this.estoquesTotal = estoquesTotal;
	}
	
	public BigDecimal getMoveisUtensilios() {
		return moveisUtensilios;
	}
	
	public void setMoveisUtensilios(BigDecimal moveisUtensilios) {
		this.moveisUtensilios = moveisUtensilios;
	}
	
	public BigDecimal getVeiculos() {
		return veiculos;
	}
	
	public void setVeiculos(BigDecimal veiculos) {
		this.veiculos = veiculos;
	}
	
	public BigDecimal getMaquinasEquipamentos() {
		return maquinasEquipamentos;
	}
	public void setMaquinasEquipamentos(BigDecimal maquinasEquipamentos) {
		this.maquinasEquipamentos = maquinasEquipamentos;
	}
	public BigDecimal getDepreciacao() {
		return depreciacao;
	}
	public void setDepreciacao(BigDecimal depreciacao) {
		this.depreciacao = depreciacao;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Date getAno() {
		return ano;
	}
	public void setAno(Date ano) {
		this.ano = ano;
	}
}
