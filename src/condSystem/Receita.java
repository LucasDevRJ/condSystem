package condSystem;

public class Receita {

	private float total;
	
	public float getTotal() {
		return this.total;
	}
	
	public void setTotal(Apartamento apartamento) {
		this.total += apartamento.getPrecoAluguel();
	}
}
