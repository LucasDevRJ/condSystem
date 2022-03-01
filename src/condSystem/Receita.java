package condSystem;

public class Receita {

	private float total;
	
	public void receitaTotal(Apartamento aluguel) {
		this.total += aluguel.getPrecoAlguel();
	}
	
	public float getTotal() {
		return total;
	}
	
	public void setTotal(float total) {
		this.total = total;
	}
}
