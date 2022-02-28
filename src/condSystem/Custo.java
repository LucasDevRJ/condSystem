package condSystem;

public class Custo {

	private float salario;
	private float materialConstrucao;
	private float construcao;
	private float materialLimpeza;
	private float consertos;
	private float total;
	
	public float getSalario(Colaborador colaborador) {
		return this.salario += colaborador.getSalario();
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
		return total = this.salario + this.materialConstrucao + this.construcao + this.materialLimpeza + this.consertos;
	}
}
