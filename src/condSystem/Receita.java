package condSystem;

public class Receita {

	private float total;
	
	public void receitaTotal(Apartamento aluguel) {
		this.total += aluguel.getPrecoAluguel();
	}
	
	public float getTotal() {
		return this.total += aluguel.getPrecoAluguel();
	}
	
	public void setTotal(float total) {
		this.total = total;
	}
}
