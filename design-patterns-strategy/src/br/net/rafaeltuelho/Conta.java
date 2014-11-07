package br.net.rafaeltuelho;

public class Conta {
	private double saldo;

	public Conta(double saldo){
		this.saldo = saldo;
		
	}

	public void atualizaSaldo(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

}
