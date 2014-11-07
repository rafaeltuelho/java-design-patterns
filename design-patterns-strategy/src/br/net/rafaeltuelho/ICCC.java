package br.net.rafaeltuelho;

public class ICCC implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		double imposto = 0.0;
		
		if (orcamento.getValor() < 1000.0)
			imposto = orcamento.getValor() * 0.05;
		else if (orcamento.getValor() >= 1000.0 &&
				 orcamento.getValor() <= 3000.0)
			imposto = orcamento.getValor() * 0.07;
		else if (orcamento.getValor() > 3000.0)
			imposto = (orcamento.getValor() * 0.08) + 30.0;
		
		
		return imposto;
	}

}
