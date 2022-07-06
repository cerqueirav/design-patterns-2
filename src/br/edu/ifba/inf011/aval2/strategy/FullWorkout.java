package br.edu.ifba.inf011.aval2.strategy;

import java.time.DayOfWeek;

import br.edu.ifba.inf011.aval2.enums.GrupoMuscular;
import br.edu.ifba.inf011.aval2.enums.TipoExercicio;
import br.edu.ifba.inf011.aval2.utils.Utils;

public class FullWorkout extends ProgramaState{

	public FullWorkout(Programa programa) {
		super(programa);
		this.diasOciosos.addAll(Utils.daysRestFullWorkoutOrCardio());
		setSerieOfProgram(25, 40);
	}
		
	private void setSerieOfProgram(int numRep, int qtd) {
		super.makeSerie(GrupoMuscular.getGrupoByDay(DayOfWeek.MONDAY), TipoExercicio.Cardiovascular, numRep, qtd);
		super.makeSerie(GrupoMuscular.getGrupoByDay(DayOfWeek.TUESDAY), TipoExercicio.Mobilidade, numRep, qtd);
		super.makeSerie(GrupoMuscular.getGrupoByDay(DayOfWeek.WEDNESDAY), TipoExercicio.Funcional, numRep, qtd);
		super.makeSerie(GrupoMuscular.getGrupoByDay(DayOfWeek.THURSDAY), TipoExercicio.Resistido, numRep, qtd);
	}

}

