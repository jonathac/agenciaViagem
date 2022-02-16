package br.com.projetoagencia.model;

import javax.annotation.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "TB_CLIENTE")
@SequenceGenerator(allocationSize = 1, name = "cliente", sequenceName = "sq_cliente")
@ManagedBean
public class Cliente {
	
	@Id
	@GeneratedValue(generator = "cliente", strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Long id;
	
	@Column(name = "nm_nome")
	private String nome;
	
	@Column(name = "ds_cpf")
	private String cpf;
		
	@Column(name = "nr_telefone")
	private String telefone;
	
	@Column(name = "ds_email")
	private String email;
	
	@Column(name = "nr_senha")
	private String senha;
	
	@Column(name = "ds_rua")
	private String rua;
	
	@Column(name = "ds_cidade")
	private String cidade;
	
	@Column(name = "ds_estado")
	private String estado;
	
	@Column(name = "nr_numero")
	private String numero;
	
	@Column(name = "ds_cep")
	private String cep;
	
	public Cliente() {
		
	}

	public Cliente(Long id, String nome, String cpf, String telefone, String email, String senha, String rua, String cidade, String estado, String numero, String cep) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.rua = rua;
		this.cidade = cidade;
		this.estado = estado;
		this.numero = numero;
		this.cep = cep;
	}

	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
}