package br.edu.ifba.inf011.aval2.state;

import java.util.Map;

import br.edu.ifba.inf011.aval2.enums.DiaDaSemana;
import br.edu.ifba.inf011.aval2.enums.TipoPrograma;

public class Programa {
	private TipoPrograma tipoPrograma;
	private Map<DiaDaSemana, Serie> series;
	
	public void init() {
	
	}
	
	public boolean temProximo() {
		return true;
	}
	
	public void proximo() {
		
	}
	
	public void setTipo(TipoPrograma tipoPrograma) {
		this.tipoPrograma = tipoPrograma;
	}
	
	public void setSerie(TipoPrograma tipoProgram) {
		//this.series = factory.createSerie(tipoPrograma);
	}

}
