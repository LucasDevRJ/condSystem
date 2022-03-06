package condSystem;

public class Conta {

	private int numero;
	private int agencia;
	private float saldo;
	private int senha;
	
	public void depositar(float valor, Colaborador titular) {
		if (valor <= titular.getProfissao().getSalario()) {
			this.setSaldo(valor + this.getSaldo());
			System.out.println("Deposito Realizado com Sucesso!");
			System.out.println("Valor do Deposito: R$ " + valor);
			System.out.println("Valor do Saldo Bancário: R$ " + this.getSaldo());
		} else {
			System.out.println("Valor Insuficiênte!");
		}
	}
	
	public void sacar(float valor) {
		if (valor <= this.getSaldo()) {
			this.setSaldo(valor - this.getSaldo());
			System.out.println("Saque Realizado com Sucesso!");
			System.out.println("Valor do Saque: R$ " + valor);
			System.out.println("Valor do Saldo Bancário: R$ " + this.getSaldo());
		} else {
			System.out.println("Valor Insuficiênte!");
		}
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
