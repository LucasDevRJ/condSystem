package condSystem;

public class Financeiro {

	private Despesa despesa;
	private Custo custo;
	private Receita receita;
	private float lucro;
	
	public float getLucro() {
		return this.lucro = receita.getTotal() - (despesa.getTotal() + custo.getTotal());
	}
}
