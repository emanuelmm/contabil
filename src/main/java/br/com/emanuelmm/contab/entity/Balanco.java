package br.com.emanuelmm.contab.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="balanco")
public class Balanco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="empresa_id")
	private Empresa empresa;
		
	// Ativo Circulante
	@Column(name="caixa_bancos")
	private BigDecimal caixaBancos;
	@Column(name="duplicatas_receber")
	private BigDecimal duplicatasReceber;
	@Column(name="estoques_total")
	private BigDecimal estoquesTotal;
	
	@Column(name="realizavel_longo_prazo")
	private BigDecimal realizavelLongoPrazo;
	
	@Column(name="ativo_nao_circulante")
	private BigDecimal ativoNaoCirculante;
	
	// Imobilizado
	@Column(name="moveis_utensilios")
	private BigDecimal moveisUtensilios;
	private BigDecimal veiculos;
	@Column(name="maquinas_equipamentos")
	private BigDecimal maquinasEquipamentos;
	private BigDecimal depreciacao;
	
	// Passivo Circulante
	private BigDecimal fornecedores;
	@Column(name="bancos_curto_prazo")
	private BigDecimal bancosCurtoPrazo;
	@Column(name="bancos_curto_longo_prazo")
	private BigDecimal bancosCurtoLongoPrazo;
	@Column(name="imposto_renda")
	private BigDecimal impostoRenda;
	private BigDecimal cssl;
	
	//Passivo não circulante
	@Column(name="bancos_longo_prazo")
	private BigDecimal bancosLongoPrazo;
	
	//Patrimonio Liquido
	@Column(name="capital_social")
	private BigDecimal capitalSocial;
	private BigDecimal reservas;	
	
	private String ano;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
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

	public BigDecimal getRealizavelLongoPrazo() {
		return realizavelLongoPrazo;
	}

	public void setRealizavelLongoPrazo(BigDecimal realizavelLongoPrazo) {
		this.realizavelLongoPrazo = realizavelLongoPrazo;
	}

	public BigDecimal getAtivoNaoCirculante() {
		return ativoNaoCirculante;
	}

	public void setAtivoNaoCirculante(BigDecimal ativoNaoCirculante) {
		this.ativoNaoCirculante = ativoNaoCirculante;
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

	public BigDecimal getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(BigDecimal fornecedores) {
		this.fornecedores = fornecedores;
	}

	public BigDecimal getBancosCurtoPrazo() {
		return bancosCurtoPrazo;
	}

	public void setBancosCurtoPrazo(BigDecimal bancosCurtoPrazo) {
		this.bancosCurtoPrazo = bancosCurtoPrazo;
	}

	public BigDecimal getBancosCurtoLongoPrazo() {
		return bancosCurtoLongoPrazo;
	}

	public void setBancosCurtoLongoPrazo(BigDecimal bancosCurtoLongoPrazo) {
		this.bancosCurtoLongoPrazo = bancosCurtoLongoPrazo;
	}

	public BigDecimal getImpostoRenda() {
		return impostoRenda;
	}

	public void setImpostoRenda(BigDecimal impostoRenda) {
		this.impostoRenda = impostoRenda;
	}

	public BigDecimal getCssl() {
		return cssl;
	}

	public void setCssl(BigDecimal cssl) {
		this.cssl = cssl;
	}

	public BigDecimal getBancosLongoPrazo() {
		return bancosLongoPrazo;
	}

	public void setBancosLongoPrazo(BigDecimal bancosLongoPrazo) {
		this.bancosLongoPrazo = bancosLongoPrazo;
	}

	public BigDecimal getCapitalSocial() {
		return capitalSocial;
	}

	public void setCapitalSocial(BigDecimal capitalSocial) {
		this.capitalSocial = capitalSocial;
	}

	public BigDecimal getReservas() {
		return reservas;
	}

	public void setReservas(BigDecimal reservas) {
		this.reservas = reservas;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	
	
	
}
