package br.edu.ifba.inf011.aval2.builder;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.aval2.enums.GrupoMuscular;
import br.edu.ifba.inf011.aval2.enums.TipoExercicio;
import br.edu.ifba.inf011.aval2.models.Equipamento;
import br.edu.ifba.inf011.aval2.models.Exercicio;

public class ExercicioBuilder implements ExercicioFactory{
	private String id;
	private String descricao;	
	private List<TipoExercicio> tipos;
	private List<GrupoMuscular> gruposMusculares;
	private List<Equipamento> equipamentos;	
	
	
	public static ExercicioBuilder getFactory() {
		return new ExercicioBuilder();
	}
	
	@Override
	public ExercicioFactory clear() {
		this.descricao = null;
		this.tipos = new ArrayList<TipoExercicio>();
		this.gruposMusculares = new ArrayList<GrupoMuscular>();
		this.equipamentos = new ArrayList<Equipamento>();
		return this;
	}

	@Override
	public ExercicioFactory descricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	@Override
	public ExercicioFactory withTipo(TipoExercicio tipo) {
		if (!this.tipos.contains(tipo))
			this.tipos.add(tipo);
		return this;
	}

	@Override
	public ExercicioFactory withGrupoMuscular(GrupoMuscular grupo) {
		if (!this.gruposMusculares.contains(grupo)) 
			this.gruposMusculares.add(grupo);
		return this;
	}

	@Override
	public ExercicioFactory withEquipamento(Equipamento equipamento) {
		if (!this.equipamentos.contains(equipamento))
			this.equipamentos.add(equipamento);
		return this;
	}
	
	@Override
	public ExercicioFactory withExercicio(Exercicio exercicio) {
		this.tipos.addAll(exercicio.getTipos());
		this.equipamentos.addAll(exercicio.getEquipamentos());
		this.gruposMusculares.addAll(exercicio.getGruposMusculares());
		return this;
	}
	
	@Override
	public Exercicio build(String id) {
		return new Exercicio(id, this.descricao, tipos, gruposMusculares, equipamentos);
	}

}