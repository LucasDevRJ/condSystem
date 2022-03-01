package condSystem;

public class Despesa {

	private float eletricidade;
	private float agua;
	private float gas;
	private float imposto;
	private float total;
	
	public void totalDespesa() {
		this.setTotal(this.getEletricidade() + this.getAgua() + this.getGas() + this.getImposto());
	}
	
	public float getEletricidade() {
		return eletricidade;
	}
	
	public void setEletricidade(float eletricidade) {
		this.eletricidade = eletricidade;
	}
	
	public float getAgua() {
		return agua;
	}
	
	public void setAgua(float agua) {
		this.agua = agua;
	}
	
	public float getGas() {
		return gas;
	}
	
	public void setGas(float gas) {
		this.gas = gas;
	}
	
	public float getImposto() {
		return imposto;
	}
	
	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	public float getTotal() {
		return total;
	}
	
	public void setTotal(float total) {
		this.total = total;
	}
}