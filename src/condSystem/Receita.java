package condSystem;

public class Receita {

	private float total;
	
	public void receitaTotal(Apartamento aluguel) {
		this.total += aluguel.getPrecoAluguel();
	}
	
	public float getTotal(Apartamento apartamento) {
		return this.total += apartamento.getPrecoAluguel();
	}
	
	public void setTotal(float total) {
		this.total = total;
	}
}
