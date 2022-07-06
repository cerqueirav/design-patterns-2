package br.edu.ifba.inf011.aval2.factories;

import br.edu.ifba.inf011.aval2.models.Acessorio;
import br.edu.ifba.inf011.aval2.models.Equipamento;

public class AcessorioFactory extends EquipamentoFactory{

	@Override
	protected Equipamento createEquipamento() {
		return new Acessorio();
	}

}