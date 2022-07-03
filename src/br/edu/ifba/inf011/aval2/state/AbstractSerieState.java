package br.edu.ifba.inf011.aval2.state;

import java.util.HashMap;
import java.util.Map;

import br.edu.ifba.inf011.aval2.enums.DiaDaSemana;
import br.edu.ifba.inf011.aval2.enums.StatusExercicio;
import br.edu.ifba.inf011.aval2.models.Exercicio;

public abstract class AbstractSerieState implements SerieState{
	// Verifica se todos exercicios foram concluidos
	protected boolean todosExerciciosConcluidos(Map<DiaDaSemana, Exercicio> exercicios){
		for(Exercicio exercicio : exercicios.values())
			if (exercicio.getStatus().equals(StatusExercicio.Pendente))
				return false;
		return true;
	}
	
	private Map<String, StatusExercicio> getExerciciosConcluidos(Map<DiaDaSemana, Exercicio> exercicios){
		Map<String, StatusExercicio> diasExerciciosConcluidos = new HashMap<String, StatusExercicio>();
		
		for(Exercicio exercicio : exercicios.values())
			if (exercicio.getStatus().equals(StatusExercicio.Concluido))
				diasExerciciosConcluidos.put(exercicio.getId(), exercicio.getStatus());
		
		return diasExerciciosConcluidos;
	}
	
	@Override
	public void avancar(Map<DiaDaSemana, Exercicio> exercicios, DiaDaSemana diaDaSemana, StatusExercicio statusExercicio){
		
	}

}
