package br.edu.ifba.inf011.aval2.strategy;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.aval2.enums.DiaDaSemana;
import br.edu.ifba.inf011.aval2.enums.GrupoMuscular;
import br.edu.ifba.inf011.aval2.enums.TipoExercicio;
import br.edu.ifba.inf011.aval2.observer.StateConclusao;
import br.edu.ifba.inf011.aval2.observer.Usuario;

public abstract class ProgramaState {
	public Programa programa;
	private Serie proximaSerie;
	private List<Serie> series = new ArrayList<>();
	protected List<DiaDaSemana> diasOciosos = new ArrayList<>();
	
	private List<Usuario> usuarios = new ArrayList<>(); 
	
	
	public ProgramaState(Programa programa) {
		this.programa = programa;
	}
	
	public boolean temProximo() {
	    if (ehDiaDeDescanso())
	    	return false;
	     	
	    //this.proxima = series.remove(diasOciosos);
	        
	 	return true;
	}
	
	public boolean ehDiaDeDescanso() {
		if(diasOciosos.contains(programa.getDiaDaSemana()))
			return false;
		
		return true;
	}
	
	public void addUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }
	
	public void notificaUsuarios() {
        StateConclusao stateConclusao = new StateConclusao(LocalDateTime.now(), programa.getTipo());
        for (Usuario usuario : usuarios) {
        	usuario.notifica(stateConclusao);
        }
    }
	
	public Serie proxima() {
		return this.proximaSerie;
	}
	
	protected void criaSeries(GrupoMuscular grupoMuscular, TipoExercicio tipoExercicio) {}
	
	 /*
	 Full Workout
	 A - Segunda
	 B - Quarta
	 C - Sexta  
	  
	 ABCD
	 A – Segunda – Ombros / Abdominal; 
	 B – Terça - Membros Inferiores; 
	 C- Quarta - Peitoral / Tríceps; 
	 D – Quinta – Costa / Bíceps, 
	 
	 Cardio,
	 A - Segunda, 
	 B - Quarta 
	 C - Sexta .
	 */
}
