package br.edu.ifba.inf011.aval2.state;
import java.util.HashMap;
import java.util.Map;

import br.edu.ifba.inf011.aval2.enums.DiaDaSemana;
import br.edu.ifba.inf011.aval2.enums.StatusExercicio;
import br.edu.ifba.inf011.aval2.models.Exercicio;

public class Serie {
	public class Status{
		private Serie serie;
		private Map<DiaDaSemana, Exercicio> exercicios; 	
		
		public Status(Serie serie, Map<DiaDaSemana, Exercicio> exercicios) {
			this.serie = serie;
			this.exercicios = new HashMap<DiaDaSemana, Exercicio>();
			for(DiaDaSemana diaDaSemana : exercicios.keySet())
				this.exercicios.put(diaDaSemana, (Exercicio) exercicios.get(diaDaSemana));
		}
		
		public Map<DiaDaSemana, Exercicio> getExercicios() {
			return this.exercicios;
		}
	}
	
	private int numRepeticoes;
	private int qtde;
	private SerieState serieState;
	
	private Map<DiaDaSemana, Exercicio> exercicios;
	
	
	public Serie(int numRepeticoes, int qtde, SerieState serieState, Map<DiaDaSemana, Exercicio> exercicios) {
		super();
		this.numRepeticoes = numRepeticoes;
		this.qtde = qtde;
		this.serieState = serieState;
		this.exercicios = exercicios;
	}
	
	public SerieState getState() {
		return this.serieState;
	}


	public void executar() {
		
	}
	
	public void avancar(DiaDaSemana diaDaSemana, StatusExercicio statusExercicio) {
		this.serieState.avancar(this.exercicios, diaDaSemana,  statusExercicio);
	}
}
