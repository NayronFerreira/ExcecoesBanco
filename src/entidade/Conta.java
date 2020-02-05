package entidade;

import model.excecoes.DomainExcecoes;

public class Conta {

	private Integer numero;
	private String titular;
	private Double saldo;
	Double saqueLimite;

	public Conta() {

	}

	public Conta(Integer numero, String titular, Double saldo, Double saqueLimite) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.saqueLimite = saqueLimite;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getSaqueLimite() {
		return saqueLimite;
	}

	public void deposito(Double dep) {
		this.saldo = this.saldo + dep;
	}

	public void saque(Double saque) throws DomainExcecoes {
		if (saque > saqueLimite) {
			throw new DomainExcecoes("O saque desejado é maior que o limite de saque!");
		}
		if (saque > saqueLimite && saque > saldo) {
			throw new DomainExcecoes("O saque desejado é maior que o limite de saque!");

		}
		if (saque < saqueLimite && saque > saldo) {
			throw new DomainExcecoes("O saque desejado é maior que o saldo!");

		}

		this.saldo = this.saldo - saque;

	}
}
