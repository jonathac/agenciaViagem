package br.com.projetoagencia.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CRUZEIRO")
@PrimaryKeyJoinColumn(name = "id_cruzeiro")
public class Cruzeiro extends PlanoViagem{
	
	@Column(name = "qnt_parada")
	private int quantParada;
	
	@Column(name = "qnt_diaria")
	private int quantDiaria;
	
	@Column(name = "nr_valor")
	private double valor;
	
	private String tipoNavio;
	
	private String tipoViagem;

	private String classeViagem;
	
	public Cruzeiro() {
		
	}
	
	public Cruzeiro(String destino, Calendar dataIda, Calendar dataVolta, int quantidadePessoas, TipoViagem tipoViagem,
			ClasseViagem classeViagem, int quantParada, int quantDiaria, double valor, TipoNavio tipoNavio, double taxaServico) {
		super();
		this.quantParada = quantParada;
		this.quantDiaria = quantDiaria;
		this.valor = valor;
		this.setTipoNavio(tipoNavio.getDescription());
		this.tipoViagem = tipoViagem.getDescription();
		this.classeViagem = classeViagem.getDescription();
	}
	public int getQuantParada() {
		return quantParada;
	}
	public void setQuantParada(int quantParada) {
		this.quantParada = quantParada;
	}
	public int getQuantDiaria() {
		return quantDiaria;
	}
	public void setQuantDiaria(int quantDiaria) {
		this.quantDiaria = quantDiaria;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipoNavio() {
		return tipoNavio;
	}

	public void setTipoNavio(String tipoNavio) {
		this.tipoNavio = tipoNavio;
	}
	public String getTipoViagem() {
		return tipoViagem;
	}

	public void setTipoViagem(String tipoViagem) {
		this.tipoViagem = tipoViagem;
	}

	public String getClasseViagem() {
		return classeViagem;
	}

	public void setClasseViagem(String classeViagem) {
		this.classeViagem = classeViagem;
	}
	
	


}
