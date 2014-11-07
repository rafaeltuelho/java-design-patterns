package br.net.rafaeltuelho;

public class RealizadorDeInvestimentos {
	public RealizadorDeInvestimentos(){
		
	}
	
	public void realizaInvestimento(Conta conta, Investimento investimento){
		
		double retornoDoInvestimento = investimento.investe(conta.getSaldo()) * 0.75;
		conta.atualizaSaldo(retornoDoInvestimento);
		System.out.println("Saldo após investimento: R$" + conta.getSaldo());
		
	}
}
