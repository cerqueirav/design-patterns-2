package br.edu.ifba.inf011.aval2.strategy;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import br.edu.ifba.inf011.aval2.builder.ExercicioBuilder;
import br.edu.ifba.inf011.aval2.enums.GrupoMuscular;
import br.edu.ifba.inf011.aval2.enums.TipoExercicio;
import br.edu.ifba.inf011.aval2.factories.AcessorioFactory;
import br.edu.ifba.inf011.aval2.factories.HalteresFactory;
import br.edu.ifba.inf011.aval2.factories.MaquinasFactory;
import br.edu.ifba.inf011.aval2.models.Equipamento;
import br.edu.ifba.inf011.aval2.models.Exercicio;
import br.edu.ifba.inf011.aval2.observer.StateConclusao;
import br.edu.ifba.inf011.aval2.observer.Usuario;

public abstract class ProgramaState {
	public Programa programa;
	private Serie proximaSerie;
	ArrayList<DayOfWeek> diasOciosos = new ArrayList<>();
	public Stack<Serie> series = new Stack<>();
	
	private List<Usuario> usuarios = new ArrayList<>(); 

	
	public ProgramaState(Programa programa) {
		this.programa = programa;
	}
	
	public boolean temProximo() {
	    if (ehDiaDeDescanso())
	    	return false;
	        
	 	return true;
	}
	
	public boolean ehDiaDeDescanso() {
		if(diasOciosos.contains(programa.getDiaAtual()))
			return true;
		try {
			this.proximaSerie = series.pop();
			return true;
		}
		// Lista vazia de serie (pilha desempilhada por completo)
		catch(Exception e) {
			return false;
		}
	}
	
	public void addUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }
	
	public void notificaUsuarios() {
        StateConclusao stateConclusao = new StateConclusao(LocalDateTime.now(), programa.getTipo());
        for (Usuario usuario : usuarios) {
        	usuario.notificar(stateConclusao);
        }
    }
	
	public Serie proxima() {
		return this.proximaSerie;
	}
	
	protected Serie makeSerie(GrupoMuscular grupoMuscular, TipoExercicio tipoExercicio, int numRep, int qtd) {
		Equipamento equipamento1 = new AcessorioFactory().getEquipamento("AC01", 20);
		Equipamento equipamento2 = new HalteresFactory().getEquipamento("HT02", 30);
		Equipamento equipamento3 = new MaquinasFactory().getEquipamento("MQ03", 50);
			
		Exercicio exercicio = 
				ExercicioBuilder.getFactory().clear()
				.withGrupoMuscular(grupoMuscular)
				.withTipo(tipoExercicio)
				.withEquipamento(equipamento1)
				.withEquipamento(equipamento2)
				.withEquipamento(equipamento3)
				.build(tipoExercicio.name());
		
		return new Serie(numRep, qtd, exercicio);
	}
}
