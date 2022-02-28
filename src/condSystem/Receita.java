package condSystem;

public class Receita {

	private Apartamento aluguel;
	private float total;
	
	public Apartamento getAluguel() {
		return aluguel;
	}
	
	public void setAluguel(Apartamento aluguel) {
		this.aluguel = aluguel;
	}
	
	public float getTotal() {
		return this.total += aluguel.getPrecoAlguel();
	}
}
