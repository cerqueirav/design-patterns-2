package br.edu.ifba.inf011.aval2.observer;

public class Usuario implements Observable{
	@Override
	public void notifica(StateConclusao stateConclusao) {
		 System.out.println("*Não há mais nenhuma série disponível para execução*");
	     
		 System.out.println("Dados sobre a finalização do programa: ");
		 System.out.println("Data e horário: " + stateConclusao.horaConclusao);
		 System.out.println("Tipo do programa: " + stateConclusao.tipoPrograma);
	}
}

