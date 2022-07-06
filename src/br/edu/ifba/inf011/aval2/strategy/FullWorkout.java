package br.edu.ifba.inf011.aval2.strategy;

import br.edu.ifba.inf011.aval2.enums.DiaDaSemana;
import br.edu.ifba.inf011.aval2.enums.GrupoMuscular;
import br.edu.ifba.inf011.aval2.enums.TipoExercicio;

public class FullWorkout extends ProgramaState{

	public FullWorkout(Programa programa) {
		super(programa);
		this.diasOciosos.add(DiaDaSemana.Terca);
		this.diasOciosos.add(DiaDaSemana.Quinta);
		this.diasOciosos.add(DiaDaSemana.Sabado);
		this.diasOciosos.add(DiaDaSemana.Domingo);
		
		super.criaSeries(GrupoMuscular.Ombros, TipoExercicio.Cardiovascular);
        super.criaSeries(GrupoMuscular.Inferiores, TipoExercicio.Mobilidade);
        super.criaSeries(GrupoMuscular.Peito, TipoExercicio.Funcional);
        super.criaSeries(GrupoMuscular.Biceps, TipoExercicio.Resistido);
	}

}

