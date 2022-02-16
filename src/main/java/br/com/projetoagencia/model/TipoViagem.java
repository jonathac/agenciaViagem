package br.com.projetoagencia.model;

public enum TipoViagem {
	
	NACIONAL(1, "VIAGEM NACIONAL"),
	INTERNACIONAL(2, "VIAGEM INTERNACIONAL");
	
	private int code;
	private String description;
	
	
	private TipoViagem(int code, String description) {
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
