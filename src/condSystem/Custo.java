package condSystem;

public class Custo {

	private float salario;
	private float materialConstrucao;
	private float construcao;
	private float materialLimpeza;
	private float consertos;
	private float total;
	
	public void custoTotal() {
		this.setTotal(this.getConsertos() + this.getConstrucao() + this.getMaterialConstrucao() + this.getMaterialLimpeza() + this.getSalario());
	}
	
	public float getSalario() {
		return salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public float getMaterialConstrucao() {
		return materialConstrucao;
	}
	
	public void setMaterialConstrucao(float materialConstrucao) {
		this.materialConstrucao = materialConstrucao;
	}
	
	public float getConstrucao() {
		return construcao;
	}
	
	public void setConstrucao(float construcao) {
		this.construcao = construcao;
	}
	
	public float getMaterialLimpeza() {
		return materialLimpeza;
	}
	
	public void setMaterialLimpeza(float materialLimpeza) {
		this.materialLimpeza = materialLimpeza;
	}
	
	public float getConsertos() {
		return consertos;
	}
	
	public void setConsertos(float consertos) {
		this.consertos = consertos;
	}
	
	public float getTotal() {
		return total;
	}
	
	public void setTotal(float total) {
		this.total = total;
	}
}
