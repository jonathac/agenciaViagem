package br.com.projetoagencia.model;

public enum CompanhiaAerea {
	
	LATAM(1, "LATAM"),
	AZUL(2, "AZUL"),
	AVIANCA(3, "AVIANCA"),
	GOL(4, "GOL"),
	EMIRATES(5, "EMIRATES"),
	UNITED(6, "UNITED"),
	AMERICANAIRLINES(7, "AMERICAN AIRLINES"),
	AIRCANADA(8, "AIR CANADA");
	
	private int code;
	private String description;

	
	private CompanhiaAerea(int code, String description) {
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
