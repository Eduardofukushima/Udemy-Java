package entities;

public class Conta {
	
	private int numero;
	private String usuario;
	private double balanco;
	
	public Conta(int numero, String usuario, double depositoInicial) {
		this.numero = numero;
		this.usuario = usuario;
		deposito(depositoInicial);
	}

	public Conta(int numero, String usuario) {
		super();
		this.numero = numero;
		this.usuario = usuario;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setBalanco(double balanco) {
		this.balanco = balanco;
	}
	
	public void deposito(double valor) {
		balanco += valor;
	}
	
	public void saque(double valor) {
		balanco -= valor + 5.0;
	}

	@Override
	public String toString() {
		return "Conta " 
				+numero 
				+ ", usuario = " 
				+ usuario 
				+ ", Saldo = R$ " 
				+ String.format("%.2f", balanco);
	}
	
	
	

}
