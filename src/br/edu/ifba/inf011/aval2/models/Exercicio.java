package br.edu.ifba.inf011.aval2.models;

import java.util.LinkedList;
import java.util.List;

import br.edu.ifba.inf011.aval2.enums.GrupoMuscular;
import br.edu.ifba.inf011.aval2.enums.StatusExercicio;
import br.edu.ifba.inf011.aval2.enums.TipoExercicio;

public class Exercicio{
	private String id;
	private String descricao;
	private List<TipoExercicio> tipos;
	private List<GrupoMuscular> gruposMusculares;
	private List<Equipamento> equipamentos;
	private StatusExercicio statusExercicio;
	
	public Exercicio(Exercicio exercicio) {
		this.setId(exercicio.getId());
		this.setDescricao(exercicio.getDescricao());
		this.tipos = new LinkedList<TipoExercicio>(exercicio.tipos);
		this.gruposMusculares = new LinkedList<GrupoMuscular>(exercicio.gruposMusculares);
		this.equipamentos = exercicio.equipamentos = new LinkedList<Equipamento>(exercicio.equipamentos);
		this.statusExercicio = exercicio.getStatus();
	}
	
	public Exercicio(String descricao) {
		this.setId(null);
		this.setDescricao(descricao);
		this.tipos = new LinkedList<TipoExercicio>();
		this.gruposMusculares = new LinkedList<GrupoMuscular>();
		this.equipamentos = new LinkedList<Equipamento>();
		this.statusExercicio = StatusExercicio.Pendente;
	}
	
	public Exercicio(String id, String descricao, List<TipoExercicio> tipos, List<GrupoMuscular> grupos, List<Equipamento> equipamentos, StatusExercicio statusExercicio) {
		this.setId(id);
		this.setDescricao(descricao);
		this.tipos = new LinkedList<TipoExercicio>(tipos);	
		this.gruposMusculares = new LinkedList<GrupoMuscular>(grupos);
		this.equipamentos = new LinkedList<Equipamento>(equipamentos);
		this.statusExercicio = statusExercicio;
	}	
	
	public String getId() {
		return this.id;
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
	
	public void addTipo(TipoExercicio tipo) {
		this.tipos.add(tipo);
	}
	
	public List<GrupoMuscular> getGruposMusculares() {
		return gruposMusculares;
	}
	
	public void addGrupoMuscular(GrupoMuscular grupoMuscular) {
		this.gruposMusculares.add(grupoMuscular);
	}
	
	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}
	
	public void addEquipamento(Equipamento equipamento) {
		this.equipamentos.add(equipamento);
	}
	
	public StatusExercicio getStatus() {
		return this.statusExercicio;
	}
	
	public void setStatus(StatusExercicio statusExercicio) {
		this.statusExercicio = statusExercicio;
	}
	
	public void avancar(StatusExercicio statusExercicio) {
		if(statusExercicio.equals(StatusExercicio.Pendente)) 
			return;
		
		this.statusExercicio = StatusExercicio.Concluido;
	}
	
	@Override
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
