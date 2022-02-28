package condSystem;

public class Pedreiro extends Colaborador {

	private boolean estaConsertado;
	private boolean foiConstruido;
	
	public void consertar(String oQue) {
		if (this.isEstaConsertado() == false) {
			System.out.println("O pedreiro " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta consertando o " + oQue + ".");
			this.setEstaConsertado(true);
		} else {
			System.out.println("O " + oQue + " já foi consertado!");
		}
	}
	
	public void construir(String oQue) {
		if (this.isFoiConstruido() == false) {
			System.out.println("O pedreiro " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta construindo o " + oQue + ".");
			this.setFoiConstruido(true);
		} else {
			System.out.println("O " + oQue + " já foi construido!");
		}
	}
	
	public boolean isEstaConsertado() {
		return estaConsertado;
	}
	
	public void setEstaConsertado(boolean estaConsertado) {
		this.estaConsertado = estaConsertado;
	}
	
	public boolean isFoiConstruido() {
		return foiConstruido;
	}
	
	public void setFoiConstruido(boolean foiConstruido) {
		this.foiConstruido = foiConstruido;
	}
}
