package br.edu.ifba.inf011.aval2.strategy;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import br.edu.ifba.inf011.aval2.builder.ExercicioBuilder;
import br.edu.ifba.inf011.aval2.enums.GrupoMuscular;
import br.edu.ifba.inf011.aval2.enums.TipoEquipamento;
import br.edu.ifba.inf011.aval2.enums.TipoExercicio;
import br.edu.ifba.inf011.aval2.factories.AcessorioFactory;
import br.edu.ifba.inf011.aval2.factories.EquipamentoFactory;
import br.edu.ifba.inf011.aval2.factories.HalteresFactory;
import br.edu.ifba.inf011.aval2.factories.MaquinasFactory;
import br.edu.ifba.inf011.aval2.models.Acessorio;
import br.edu.ifba.inf011.aval2.models.Equipamento;
import br.edu.ifba.inf011.aval2.models.Exercicio;
import br.edu.ifba.inf011.aval2.models.Haltere;
import br.edu.ifba.inf011.aval2.models.Maquina;
import br.edu.ifba.inf011.aval2.observer.StateConclusao;
import br.edu.ifba.inf011.aval2.observer.Usuario;

public abstract class ProgramaState {
	public Programa programa;
	private Serie proximaSerie;
	ArrayList<DayOfWeek> diasOciosos = new ArrayList<>();
	private Stack<Serie> series = new Stack<>();
	
	private List<Usuario> usuarios = new ArrayList<>(); 
	
	public ProgramaState(Programa programa) {
		this.programa = programa;
	}
	
	public boolean ehDiaDeDescanso() {
		if(diasOciosos.contains(programa.getDiaAtual())) { 
			System.out.println("Hoje é um dia ocioso");
			return false;
		}	
			try {
				System.out.println("Hoje é um dia de malhar");
				this.proximaSerie = series.pop();
				return true;
			}
			// Não não mais nenhuma serie a ser executada (pilha completamente desempilhada)
			catch(Exception e) {
				return false;
			}
	}
	
	public boolean temProximo() {
	    if (ehDiaDeDescanso())
	    	return false;
	        
	 	return true;
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
	
	protected void criarSerie(GrupoMuscular grupoMuscular, TipoExercicio tipoExercicio, int numRep, int qtd) {
		if (!series.isEmpty()) {
			Serie serie = new Serie(numRep, qtd, criarNovoExercicio(grupoMuscular, tipoExercicio));
			series.push(serie);
			series.push(serie);
			series.push(serie);
		}
	}
	
	public Exercicio criarNovoExercicio(GrupoMuscular grupoMuscular, TipoExercicio tipoExercicio) {
		Equipamento equipamento = new Acessorio("EQP01", 20);
		Equipamento equipamento2 = new Haltere("HAL04", 40);
		Equipamento equipamento3 = new Maquina("MAQ91", 40);
				
		Exercicio exercicio = 
				ExercicioBuilder.getFactory().clear()
				.withGrupoMuscular(grupoMuscular)
				.withEquipamento(equipamento)
				.withTipo(tipoExercicio)
				.withEquipamento(equipamento2)
				.withEquipamento(equipamento3)
				.build(tipoExercicio.name());
		
		return exercicio;
	}
}
