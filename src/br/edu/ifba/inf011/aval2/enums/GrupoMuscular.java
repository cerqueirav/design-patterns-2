package br.edu.ifba.inf011.aval2.enums;

import java.time.DayOfWeek;

public enum GrupoMuscular {
	Biceps, 
	Triceps, 
	Peitoral, 
	Costa, 
	Inferiores, 
	Ombros,
	Ombro_Abdominal,
	Peitoral_Triceps,
	Peitoral_Biceps,
	Costa_Biceps;
	
	public static GrupoMuscular getGrupoByDay(DayOfWeek dayOfWeek){
		switch(dayOfWeek) {
			case MONDAY: return GrupoMuscular.Ombro_Abdominal;
			case TUESDAY: return GrupoMuscular.Inferiores; 
			case WEDNESDAY: return GrupoMuscular.Peitoral_Triceps; 
			case THURSDAY: return GrupoMuscular.Costa_Biceps; 
		}
		return null;
	}
}

