package br.edu.ifba.inf011.aval2.models;

import java.util.ArrayList;
import java.util.List;
import br.edu.ifba.inf011.aval2.enums.GrupoMuscular;
import br.edu.ifba.inf011.aval2.enums.TipoExercicio;


public class Exercicio {
	private String id;
	private String descricao;	
	private List<TipoExercicio> tipos;
	private List<GrupoMuscular> gruposMusculares;
	private List<Equipamento> equipamentos;
		
	public Exercicio(String id, String descricao, List<TipoExercicio> tipos,
					 List<GrupoMuscular> gruposMusculares, 
					 List<Equipamento> equipamentos) {
		this.id = id;
		this.descricao = descricao;
		this.tipos = new ArrayList<TipoExercicio>(tipos);
		this.gruposMusculares = new ArrayList<GrupoMuscular>(gruposMusculares);
		this.equipamentos = new ArrayList<Equipamento>(equipamentos);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<TipoExercicio> getTipos() {
		return tipos;
	}

	public void setTipos(List<TipoExercicio> tipos) {
		this.tipos = tipos;
	}

	public List<GrupoMuscular> getGruposMusculares() {
		return gruposMusculares;
	}

	public void setGruposMusculares(List<GrupoMuscular> gruposMusculares) {
		this.gruposMusculares = gruposMusculares;
	}

	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(List<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}

	public String toString() {
		String desc = this.id + "\t" + this.descricao;
		desc += "\n\t";		
		for(TipoExercicio tipo : this.tipos)
			desc += (tipo + "\n\t");
		if(this.tipos.size() == 0)
			desc += "\n\t";
		for(GrupoMuscular grupo : this.gruposMusculares)
			desc += (grupo + "\n\t");
		if(this.gruposMusculares.size() == 0)
			desc += "\n\t";
		for(Equipamento equipamento : this.equipamentos)
			desc += (equipamento + "\n\t");
		if(this.gruposMusculares.size() == 0)
			desc += "\n\t";
		return desc;
	}
	
	
}