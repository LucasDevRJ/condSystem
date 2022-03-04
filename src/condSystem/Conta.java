package condSystem;

public class Conta {

	private String numero;
	private int agencia;
	private float saldo;
	private int senha;
	
	public void depositar(float valor, Morador titular) {
		if (valor <= titular.getProfissao().getSalario()) {
			this.setSaldo(valor + this.getSaldo());
		} else {
			System.out.println("Valor Insuficiênte!");
		}
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
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
