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
@Table(name = "TB_PASSAGEMAEREA")
@SequenceGenerator(allocationSize = 1, name = "passagem", sequenceName = "sq_passagem")
public class PassagemAerea {

	@Id
	@Column(name="id_passagem_aeria")
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator = "passagem")
	private Long id;

	@Column(name = "nr_valor")
	private double valor;
	
	@OneToOne(mappedBy = "passagem")
	private PacoteViagem pacote;

	private String tipoBagagem;
	

	private String companhiaAerea;
	
	private String classeViagem;
	
	public PassagemAerea() {
		
	}

	

	public PassagemAerea(double valor, String tipoBagagem, String companhiaAerea, String classeViagem) {
		super();
		this.valor = valor;
		this.tipoBagagem = tipoBagagem;
		this.companhiaAerea = companhiaAerea;
		this.classeViagem = classeViagem;
	}



	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getTipoBagagem() {
		return tipoBagagem;
	}
	public void setTipoBagagem(String tipoBagagem) {
		this.tipoBagagem = tipoBagagem;
	}
	public String getCompanhiaAerea() {
		return companhiaAerea;
	}
	public void setCompanhiaAerea(String companhiaAerea) {
		this.companhiaAerea = companhiaAerea;
	}

	public String getClasseViagem() {
		return classeViagem;
	}

	public void setClasseViagem(String classeViagem) {
		this.classeViagem = classeViagem;
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
