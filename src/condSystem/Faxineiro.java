package condSystem;

public class Faxineiro extends Colaborador {
	
	private boolean estaLimpo;

	public void faxinar(String local) {
		if (isEstaLimpo() == false) {
			System.out.println("Faxineiro esta faxinando o " + local + ".");
			this.estaLimpo = true;
		} else {
			System.out.println("O " + local + " já esta limpo.");
		}
	}

	public boolean isEstaLimpo() {
		return estaLimpo;
	}

	public void setEstaLimpo(boolean estaLimpo) {
		this.estaLimpo = estaLimpo;
	}
}
