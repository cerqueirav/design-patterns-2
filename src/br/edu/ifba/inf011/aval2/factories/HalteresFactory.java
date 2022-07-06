package br.edu.ifba.inf011.aval2.factories;

import br.edu.ifba.inf011.aval2.models.Equipamento;
import br.edu.ifba.inf011.aval2.models.Haltere;

public class HalteresFactory extends EquipamentoFactory{

	@Override
	protected Equipamento createEquipamento() {
		return new Haltere();
	}

}
