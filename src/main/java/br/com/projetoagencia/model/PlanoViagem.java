package br.com.projetoagencia.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "TB_PLANOVIAGEM")
@SequenceGenerator(allocationSize = 1, name = "planoviagem", sequenceName = "sq_planoviagem")
public class PlanoViagem {
	
	@Id
	@GeneratedValue(generator = "planoviagem", strategy = GenerationType.IDENTITY)
	@Column(name = "id_planoviagem")
	private Long id;
	
	@Column(name = "ds_destino")
	private String destino;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_dataIda")
	private Calendar dataIda;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_dataVolta")
	private Calendar dataVolta;
	
	@Column(name = "qnt_pessoas")
	private int quantidadePessoa;
	
	@Column(name = "ds_taxaServico")
	private double taxaServico;
	
	@Column(name="tp_viagem")
	private String tipoViagem;
	

	public PlanoViagem() {
		super();
	}

	public PlanoViagem(String destino, Calendar dataIda, Calendar dataVolta, int quantidadePessoa, double taxaServico,
			 TipoViagem tipoViagem) {
		super();
		this.destino = destino;
		this.dataIda = dataIda;
		this.dataVolta = dataVolta;
		this.quantidadePessoa = quantidadePessoa;
		this.taxaServico = taxaServico;
		this.tipoViagem = tipoViagem.getDescription();
	}



	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Calendar getDataIda() {
		return dataIda;
	}

	public void setDataIda(Calendar dataIda) {
		this.dataIda = dataIda;
	}

	public Calendar getDataVolta() {
		return dataVolta;
	}

	public void setDataVolta(Calendar dataVolta) {
		this.dataVolta = dataVolta;
	}

	public int getQuantidadePessoa() {
		return quantidadePessoa;
	}

	public void setQuantidadePessoa(int quantidadePessoa) {
		this.quantidadePessoa = quantidadePessoa;
	}

	public double getTaxaServico() {
		return taxaServico;
	}

	public void setTaxaServico(double taxaServico) {
		this.taxaServico = taxaServico;
	}

	public String getTipoViagem() {
		return tipoViagem;
	}

	public void setTipoViagem(String tipoViagem) {
		this.tipoViagem = tipoViagem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

	

}
