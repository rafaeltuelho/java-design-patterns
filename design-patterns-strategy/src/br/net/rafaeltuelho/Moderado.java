package br.net.rafaeltuelho;

import java.util.Random;

public class Moderado implements Investimento{

	@Override
	public double investe(double valor) {
		Random random = new Random();
		
		if (random.nextInt(2) == 0)
			return valor * 0.025;
		else
			return valor * 0.007;
		
	}

}
