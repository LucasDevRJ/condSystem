package condSystem;

public class Despesa {

	private float eletricidade;
	private float agua;
	private float gas;
	private float imposto;
	private float total;

	public float getEletricidade() {
		return eletricidade;
	}
	
	public void setEletricidade(float eletricidade) {
		if (eletricidade <= 0) {
			throw new IllegalArgumentException("Insira um valor de eletricidade válido, por favor!");
		}
		
		this.eletricidade = eletricidade;
	}
	
	public float getAgua() {
		return agua;
	}
	
	public void setAgua(float agua) {
		if (agua <= 0) {
			throw new IllegalArgumentException("Insira um valor de aguá válido, por favor!");
		}
		
		this.agua = agua;
	}
	
	public float getGas() {
		return gas;
	}
	
	public void setGas(float gas) {
		if (gas <= 0) {
			throw new IllegalArgumentException("Insira um valor de gás válido, por favor!");
		}
		
		this.gas = gas;
	}
	
	public float getImposto() {
		return imposto;
	}
	
	public void setImposto(float imposto) {
		if (imposto <= 0) {
			throw new IllegalArgumentException("Insira um valor de imposto válido, por favor!");
		}
		
		this.imposto = imposto;
	}
	
	public float getTotal() {
		return total = this.getAgua() + this.getEletricidade() + this.getGas() + this.getImposto();
	}
}
