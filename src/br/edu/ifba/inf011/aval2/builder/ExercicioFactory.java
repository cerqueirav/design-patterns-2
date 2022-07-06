package br.edu.ifba.inf011.aval2.builder;

import br.edu.ifba.inf011.aval2.enums.GrupoMuscular;
import br.edu.ifba.inf011.aval2.enums.TipoExercicio;
import br.edu.ifba.inf011.aval2.models.Equipamento;
import br.edu.ifba.inf011.aval2.models.Exercicio;

public interface ExercicioFactory {
	public ExercicioFactory clear();
	public ExercicioFactory descricao(String descricao);
	public ExercicioFactory withTipo(TipoExercicio tipo);
	public ExercicioFactory withGrupoMuscular(GrupoMuscular grupo);
	public ExercicioFactory withEquipamento(Equipamento equipamento);
	public ExercicioFactory withExercicio(Exercicio exercicio);
	public Exercicio build(String id);
}