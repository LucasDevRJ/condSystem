package condSystem;

public class Custo {

	private float salarioTotal;
	private float materialConstrucao;
	private float construcao;
	private float materialLimpeza;
	private float consertos;
	private float total;
	
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
		 total = this.getConsertos() + this.getConstrucao() + this.getMaterialConstrucao() + this.getMaterialLimpeza() + this.getSalarioTotal();
		 return Math.round(total);
	}
	
	public float getSalarioTotal() {
		return salarioTotal;
	}
	
	public void setSalarioTotal(Colaborador colaborador) {
		this.salarioTotal += colaborador.getProfissao().getSalario();
	}
}
