package br.edu.ifba.inf011.aval2.strategy;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

import br.edu.ifba.inf011.aval2.enums.TipoPrograma;
import br.edu.ifba.inf011.aval2.observer.Usuario;

public class Programa {
	private TipoPrograma tipoPrograma;
	public ProgramaState programaState;
	private DayOfWeek diaAtual;
	
	public Programa(){
		//this.diaAtual = LocalDateTime.now().getDayOfWeek();
		this.diaAtual = DayOfWeek.THURSDAY;
	}
	
	// Padrao de projeto strategy
	public void setStrategy(TipoPrograma tipoPrograma) {
		if (tipoPrograma.equals(TipoPrograma.ABCD))
			this.programaState = new Abcd(this);
		else if(tipoPrograma.equals(TipoPrograma.FullWorkout))
			this.programaState = new FullWorkout(this);
		else if (tipoPrograma.equals(TipoPrograma.Cardio))
			this.programaState = new Cardio(this);
	}
	
	public boolean temProximo() {
		return programaState.temProximo();
	}
	
	public Serie proximo() {
		return programaState.proxima();
	}
	 
    public DayOfWeek getDiaAtual() {
        return this.diaAtual;
    }
    
    public void init() {}
    
    public void setTipo(TipoPrograma tipoPrograma) {
		this.tipoPrograma = tipoPrograma;
		setStrategy(tipoPrograma);
	}

	public void addUsuario(Usuario usuario){
		programaState.addUsuario(usuario);
	}
	
	public TipoPrograma getTipo() {
		return this.tipoPrograma;
	}
}
