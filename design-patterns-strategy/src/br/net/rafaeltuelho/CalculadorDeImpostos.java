package br.net.rafaeltuelho;

public class CalculadorDeImpostos {

	public CalculadorDeImpostos() {	
	}
	
	public void realizaCalculo(Orcamento orcamento, Imposto imposto){
		System.out.println("Imposto: " + imposto.calcula(orcamento));
	}
}
