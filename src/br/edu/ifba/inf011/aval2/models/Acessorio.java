package br.edu.ifba.inf011.aval2.models;

public class Acessorio extends Equipamento{
	private String descricao;
	
	public Acessorio() {
		super();
	}
	
	public Acessorio(Acessorio acessorio) {
		super(acessorio);
		this.setDescricao(acessorio.getDescricao());
	}
	
	public Acessorio(String identificador, int quantidade) {
		this(identificador, quantidade, null);
	}
	
	public Acessorio(String identificador, int quantidade, String descricao) {
		super(identificador, quantidade);
		this.setDescricao(descricao);
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String toString() {
		return "Acessório - " + super.toString() + " - " 
				+ this.getIdentificador();
	}
}
