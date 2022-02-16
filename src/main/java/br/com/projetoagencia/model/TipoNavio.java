package br.com.projetoagencia.model;

public enum TipoNavio {
	
	MSCFANTASIA(1, "MSC FANTASIA"),
	DISNEY(2, "DISNEY CRUISE LINE"),
	ROYALCARIBBEAN(3, "ROYAL CARIBBEAN"),
	MSCOPERA(4, "MSC OPERA"),
	MSCMUSICAL(5, "MSC MUSICAL");
	
	private int code;
	private String description;
	
	private TipoNavio() {
		
	}
	
	private TipoNavio(int code, String description) {
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
