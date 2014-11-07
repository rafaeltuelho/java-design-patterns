package br.net.rafaeltuelho;

public class TesteDeInvestimento {
	public static void main(String[] args) {
		Conta conta1 = new Conta(100.0);
		Conta conta2 = new Conta(500.0);
		Conta conta3 = new Conta(1000.0);
		
		Investimento conservador = new Conservador();
		Investimento moderado = new Moderado();
		Investimento arrojado = new Arrojado();
		
		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos(); 
		
		realizadorDeInvestimentos.realizaInvestimento(conta1, conservador);
		realizadorDeInvestimentos.realizaInvestimento(conta2, moderado);
		realizadorDeInvestimentos.realizaInvestimento(conta3, arrojado);
		
	}
}
