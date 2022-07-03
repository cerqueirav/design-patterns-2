package br.edu.ifba.inf011.aval2.state;

import java.util.Map;

import br.edu.ifba.inf011.aval2.enums.DiaDaSemana;
import br.edu.ifba.inf011.aval2.enums.StatusExercicio;
import br.edu.ifba.inf011.aval2.models.Exercicio;

public class PendenteState extends AbstractSerieState{

	@Override
	public void avancar(Map<DiaDaSemana, Exercicio> exercicios, DiaDaSemana diaDaSemana, StatusExercicio statusExercicio) {
		Exercicio exercicio = exercicios.get(diaDaSemana);
		exercicio.avancar(statusExercicio);
	}
	
	public SerieState concluir(Map<DiaDaSemana, Exercicio> exercicios) {
		if(this.todosExerciciosConcluidos(exercicios))
			return new ConcluidoState();
		return this;
	};

}
