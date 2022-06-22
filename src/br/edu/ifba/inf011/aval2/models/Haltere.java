package br.edu.ifba.inf011.aval2.models;

public class Haltere extends Equipamento{
	private double peso;
	
	public Haltere() {
		super();
	}
	
	public Haltere(Haltere haltere) {
		super(haltere);
		this.setPeso(haltere.getPeso());
	}
	
	public Haltere(String identificador, int quantidade) {
		this(identificador, quantidade, 0);
	}
	
	public Haltere(String identificador, int quantidade, double peso) {
		super(identificador, quantidade);
		this.setPeso(peso);
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return "Haltere - " + super.toString() + " - " 
				+ this.getPeso() + "Kg." ;
	}
}
