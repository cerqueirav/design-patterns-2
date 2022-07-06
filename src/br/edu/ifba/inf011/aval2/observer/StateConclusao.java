package br.edu.ifba.inf011.aval2.observer;

import java.time.LocalDateTime;

import br.edu.ifba.inf011.aval2.enums.TipoPrograma;

public class StateConclusao {
	public LocalDateTime horaConclusao;
    public TipoPrograma tipoPrograma;
    
    public StateConclusao(LocalDateTime horaConclusao, TipoPrograma tipoPrograma) {
        this.horaConclusao = horaConclusao;
        this.tipoPrograma = tipoPrograma;
    }
}
