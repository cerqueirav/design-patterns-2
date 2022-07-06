package br.edu.ifba.inf011.aval2.factories;

import br.edu.ifba.inf011.aval2.models.Equipamento;

public abstract class EquipamentoFactory {
	
	public Equipamento getEquipamento(String id, int quantidade) {
		Equipamento equipamento = this.createEquipamento();
		equipamento.setIdentificador(id);
		equipamento.setQuantidade(quantidade);
		return equipamento;
	}

	protected abstract Equipamento createEquipamento();

}