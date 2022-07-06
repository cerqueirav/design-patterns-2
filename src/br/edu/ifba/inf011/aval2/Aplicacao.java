package br.edu.ifba.inf011.aval2;

import br.edu.ifba.inf011.aval2.builder.CombinadoBuilder;
import br.edu.ifba.inf011.aval2.builder.ExercicioBuilder;
import br.edu.ifba.inf011.aval2.enums.GrupoMuscular;
import br.edu.ifba.inf011.aval2.enums.TipoExercicio;
import br.edu.ifba.inf011.aval2.enums.TipoPrograma;
import br.edu.ifba.inf011.aval2.models.Exercicio;
import br.edu.ifba.inf011.aval2.strategy.Programa;
import br.edu.ifba.inf011.aval2.strategy.Serie;

public class Aplicacao {
	private void rodarQ1() {
	 	Programa programa = new Programa();
	    programa.setTipo(TipoPrograma.Cardio);
	    programa.init();
	    while(programa.temProximo()){
	        Serie serie = programa.proximo();
	        serie.executar();
	    }
	}
	
	
	private void rodarQ2() {
	}
	
	private void rodarQ3() {
		Exercicio exercicio = ExercicioBuilder.getFactory()
				  .clear().descricao("Apoio")
				  .withGrupoMuscular(GrupoMuscular.Peito)
				  .withGrupoMuscular(GrupoMuscular.Triceps)
				  .withTipo(TipoExercicio.Resistido).build("AP01");
		
		Exercicio exercicio2 = ExercicioBuilder.getFactory()
				  .clear().descricao("Barra")
				  .withGrupoMuscular(GrupoMuscular.Costa)
				  .withGrupoMuscular(GrupoMuscular.Biceps)
				  .withGrupoMuscular(GrupoMuscular.Biceps)
				  .withGrupoMuscular(GrupoMuscular.Biceps)
				  .withTipo(TipoExercicio.Resistido).build("BAR01");

		Exercicio combinado = CombinadoBuilder.getFactory().clear().descricao("Barra-Apoio")
										 .withExercicio(exercicio)
										 .withExercicio(exercicio2).build("AP-BAR01");
		
		Exercicio esteira = CombinadoBuilder.getFactory().clear().descricao("Esteira")
				 .withExercicio(combinado)
				 .withExercicio(exercicio).build("AP-BAR03");
		
		
		CombinadoBuilder.getFactory().clear().descricao("Barra-Apoio-Esteira")
	      .withExercicio(combinado)
	      .withExercicio(esteira).build("AP-BAR-EST-01");
		
		Exercicio exercicio3 = 
				ExercicioBuilder.getFactory()
				.clear()
				.withExercicio(exercicio)
				.withExercicio(exercicio2)
				.build("EXE003");
		
		System.out.println("Exercicio simples: " + exercicio);
		System.out.println("Exercicio combinado: " + exercicio2);
		System.out.println("Exercicio combinado novo: " + exercicio3);
	}
	
	private void rodarQ4() {}
	
	public static void main(String[] args){
		Aplicacao app = new Aplicacao();
		//app.rodarQ1();
		app.rodarQ2();
		//app.rodarQ3();
		//app.rodarQ4();
	}
}
