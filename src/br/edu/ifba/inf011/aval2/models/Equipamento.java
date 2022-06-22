package br.edu.ifba.inf011.aval2.models;

public abstract class Equipamento{
	private String identificador;
	private int quantidade;
	
	public Equipamento() {
		this(null, 0);
	}
	
	public Equipamento(Equipamento equipamento) {
		super();
		this.setIdentificador(equipamento.getIdentificador());
		this.setQuantidade(equipamento.getQuantidade());
	}
	
	public Equipamento(String identificador, int quantidade) {
		super();
		this.setIdentificador(identificador);
		this.setQuantidade(quantidade);
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getIdentificador() {
		return identificador;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void addQuantidade(int quantidade) {
		this.quantidade =+ quantidade; 
	}
	
	@Override
	public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode()) +
        		" |ID: " + this.getIdentificador()  +
        		" |QTD: "+ this.getQuantidade();
    }
}
