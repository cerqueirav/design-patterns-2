package br.edu.ifba.inf011.aval2.strategy;
import java.time.DayOfWeek;

import br.edu.ifba.inf011.aval2.enums.GrupoMuscular;
import br.edu.ifba.inf011.aval2.enums.TipoExercicio;
import br.edu.ifba.inf011.aval2.utils.Utils;

public class Abcd extends ProgramaState{
	public Abcd(Programa programa) {
		super(programa);
		this.diasOciosos.addAll(Utils.daysRestAbcd());
		setSerieOfProgram(this.programa.getDiaAtual(), 20, 30);
	}
	
	private void setSerieOfProgram(DayOfWeek dayOfWeek, int numRep, int qtd) {
		 super.makeSerie(GrupoMuscular.getGrupoByDay(dayOfWeek), TipoExercicio.getTipoAbcdByDay(dayOfWeek), numRep, qtd);
	}
}
