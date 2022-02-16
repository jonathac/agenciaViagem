package br.com.projetoagencia.model;

public enum TipoBagagem {
	
	ITENSPESSOAIS(1, "ITENS PESSOAIS"),
	BAGAGEMDEMAO(2, "BAGAGEM DE MÃO"),
	BAGAGEMINCLUSA(3, "BAGAGEM INCLUSA");
	
	private int code;
	private String description;
	
	private TipoBagagem() {
		
	}
	
	private TipoBagagem(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
	
}
