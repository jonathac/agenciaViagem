package br.com.projetoagencia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_HOSPEDAGEM")
@SequenceGenerator(allocationSize = 1, name = "hospedagem", sequenceName = "sq_passagem")
public class Hospedagem {

	@Id
	@Column(name="id_hospedagem")
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator = "hospedagem")
	private Long id;
	
	@Column(name = "qnt_diaria")
	private int quantDiarias;
	
	@Column(name = "nr_valor")
	private double valor;
	
	@Column(name = "qnt_quarto")
	private int quantQuarto;

	@OneToOne(mappedBy = "hospedagem")
	private PacoteViagem pacote;
	public Hospedagem() {
		
	}
	
	

	public Hospedagem(int quantDiarias, double valor, int quantQuarto, PacoteViagem pacote) {
		super();
		this.quantDiarias = quantDiarias;
		this.valor = valor;
		this.quantQuarto = quantQuarto;
		this.pacote = pacote;
	}



	public int getQuantDiarias() {
		return quantDiarias;
	}

	public void setQuantDiarias(int quantDiarias) {
		this.quantDiarias = quantDiarias;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantQuarto() {
		return quantQuarto;
	}

	public void setQuantQuarto(int quantQuarto) {
		this.quantQuarto = quantQuarto;
	}

	public Long getId() {
		return id;
	}

	public PacoteViagem getPacote() {
		return pacote;
	}


	public void setPacote(PacoteViagem pacote) {
		this.pacote = pacote;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

	
	

}
