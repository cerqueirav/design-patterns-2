package br.edu.ifba.inf011.aval2.state;

import java.util.Map;

import br.edu.ifba.inf011.aval2.enums.DiaDaSemana;
import br.edu.ifba.inf011.aval2.enums.StatusExercicio;
import br.edu.ifba.inf011.aval2.models.Exercicio;

public interface SerieState {
	public void avancar(Map<DiaDaSemana, Exercicio> exercicios, DiaDaSemana diaDaSemana, StatusExercicio statusExercicio);
}
