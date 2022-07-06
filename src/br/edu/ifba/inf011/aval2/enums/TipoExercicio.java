package br.edu.ifba.inf011.aval2.enums;

import java.time.DayOfWeek;

public enum TipoExercicio {
	Resistido,
	Funcional,
	Cardiovascular,
	Mobilidade;
	
	public static TipoExercicio getTipoAbcdByDay(DayOfWeek dayOfWeek){
		switch(dayOfWeek) {
			case MONDAY: return TipoExercicio.Funcional;
			case TUESDAY: return TipoExercicio.Cardiovascular; 
			case WEDNESDAY: return TipoExercicio.Resistido;
			case THURSDAY: return TipoExercicio.Mobilidade;
		}
		return null;
	}
}
