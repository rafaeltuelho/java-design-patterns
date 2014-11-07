package br.net.rafaeltuelho;

public class Conservador implements Investimento{

	@Override
	public double investe(double valor) {
		return valor * 0.08;	
	}

}
