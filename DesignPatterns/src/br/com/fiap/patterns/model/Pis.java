package br.com.fiap.patterns.model;

import java.util.Observable;

import br.com.fiap.patterns.config.ConfigSingleton;

public class Pis extends Observable implements Imposto {

	private float aliquota;

	
	private float valorPis;
	
	public Pis() {
		aliquota = Float.parseFloat(
				ConfigSingleton.getInstance().getProperty("aliquota"));
	}

	@Override
	public void calcularImposto(float valor) { 
		setChanged();
		valorPis = valor * aliquota;
		notifyObservers(valorPis);
	}

	public float getValorPis() {
		return valorPis;
	}

}
