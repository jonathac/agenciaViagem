package br.com.projetoagencia.model;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PACOTEVIAGEM")
@PrimaryKeyJoinColumn(name = "id_pacote_viagem")
public class PacoteViagem extends PlanoViagem {
	
	@Column(name = "nr_desconto")
	private double desconto;
	
	@Column(name = "nr_valor")
	private double valor;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "hospedagem_id")
	private Hospedagem hospedagem;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "passagem_id")
	private PassagemAerea passagem;
	


	public PacoteViagem() {
		
	}

	public PacoteViagem(String destino, Calendar dataIda, Calendar dataVolta, int quantidadePessoa, double taxaServico,
			TipoViagem tipoViagem, double desconto, double valor, Hospedagem hospedagem,
			PassagemAerea passagemAerea) {
		super(destino, dataIda, dataVolta, quantidadePessoa, taxaServico, tipoViagem);
		this.desconto = desconto;
		this.valor = valor;

	}


	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Hospedagem getHospedagem() {
		return hospedagem;
	}

	public void setHospedagem(Hospedagem hospedagem) {
		this.hospedagem = hospedagem;
	}

	public PassagemAerea getPassagem() {
		return passagem;
	}

	public void setPassagem(PassagemAerea passagem) {
		this.passagem = passagem;
	}



	

}
