package br.edu.ifba.inf011.aval2.observer;

public class Usuario implements Observable{
	@Override
	public void notifica(StateConclusao stateConclusao) {
		 System.out.println("*N�o h� mais nenhuma s�rie dispon�vel para execu��o*");
	     
		 System.out.println("Dados sobre a finaliza��o do programa: ");
		 System.out.println("Data e hor�rio: " + stateConclusao.horaConclusao);
		 System.out.println("Tipo do programa: " + stateConclusao.tipoPrograma);
	}
}

