package br.edu.ifba.inf011.aval2.strategy;

import br.edu.ifba.inf011.aval2.models.Exercicio;

public class Serie {
	private int numRepeticoes;
	private int qtde;
	private Exercicio exercicio;
	
    
    public Serie(int numRepeticoes, int qtde, Exercicio exercicio) {
        this.numRepeticoes = numRepeticoes;
        this.qtde = qtde;
        this.exercicio = exercicio;
    };
    
	public void executar() {
		System.out.println(exercicio);
	}	
}
