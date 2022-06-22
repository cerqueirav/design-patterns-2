package br.edu.ifba.inf011.aval2.models;

public class Maquinas extends Equipamento{
	private String descricao;
	private String marca;
	
	public Maquinas() {
		super();
	}
	
	public Maquinas(Maquinas maquinas) {
		super(maquinas);
		this.setDescricao(maquinas.getDescricao());
		this.setMarca(maquinas.getMarca());
	}
	
	public Maquinas(String identificador, int quantidade) {
		this(identificador, quantidade, null, null);
	}
	
	public Maquinas(String identificador, int quantidade, String descricao, String marca) {
		super(identificador, quantidade);
		this.setDescricao(descricao);
		this.setMarca(marca);
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String toString() {
		return "Máquina - " + super.toString()  
		+ (this.getDescricao() != null ? " - " + this.getDescricao() : "")   
		+ (this.getMarca() != null ? " - " + this.getMarca() : "");
	}
}
