package br.com.projetoagencia.model;

public enum ClasseViagem {
	
	ECONOMICA(1, "CLASSE ECONÔMICA"),
	EXECUTIVA(2, "CLASSE EXECUTIVA"),
	PRIMEIRACLASSE(3, "PRIMEIRA CLASSE");

	
	private int code;
	private String description;
	
	private ClasseViagem(int code, String description) {
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