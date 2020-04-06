package entities;


import model.entities.DominioExcessao;

public class Conta {
	
	private Integer numero;
	private String cliente;
	private Double saldo;
	private Double limite;
	
	public Conta() {
	}

	public Conta(Integer numero, String cliente, Double saldo, Double limite) {
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
		this.limite = limite;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
		
	public void deposito(double valor) {
		saldo += valor;
	}
	public void saque(double valor) throws DominioExcessao {
		if ( saldo < valor){
			throw new DominioExcessao( "Nao tem saldo");
		}
		if (valor> getLimite()) {
			throw new DominioExcessao("Valor superior ao limite de saque");
			}
			
		saldo -= valor ;
	}
	@Override
	public String toString() {
		return "Novo Saldo " + String.format("%.2f", getSaldo());
	}
	
}
