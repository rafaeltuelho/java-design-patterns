package br.net.rafaeltuelho;

import java.util.Random;

public class Arrojado implements Investimento{

	@Override
	public double investe(double valor) {
		Random random = new Random();
		int chute = random.nextInt(10);
		
		if (chute >= 0 && chute <= 1)
			return valor * 0.05;
		else if (chute >= 2 && chute <= 4)
			return valor * 0.3;
		else
			return valor * 0.006;
	}

}
