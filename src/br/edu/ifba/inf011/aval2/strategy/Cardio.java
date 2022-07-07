package br.edu.ifba.inf011.aval2.strategy;

import br.edu.ifba.inf011.aval2.enums.GrupoMuscular;
import br.edu.ifba.inf011.aval2.enums.TipoExercicio;
import br.edu.ifba.inf011.aval2.utils.Utils;

public class Cardio extends ProgramaState{
	public Cardio(Programa programa) {
		super(programa);
		this.diasOciosos.addAll(Utils.daysRestFullWorkoutOrCardio());
		//setSerieOfProgram(56, 55);
		super.criarSerie(GrupoMuscular.Inferiores, TipoExercicio.Cardiovascular, 12, 4);
	}
	
	private void setSerieOfProgram(int numRep, int qtd) {
		 
	}
}
