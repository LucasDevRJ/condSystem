package condSystem;

public class Porteiro extends Colaborador {
	
	private boolean portaEstaAberta;
	private boolean portaoEstaAberto;
	
	public void abrirPorta() {
		if (this.isPortaEstaAberta() == false) {
			System.out.println("O porteiro " + super.getInformacoesPessoais().getNome() +  " " + super.getInformacoesPessoais().getSobrenome() + " abriu a porta.");
			this.setPortaEstaAberta(true);
		} else {
			System.out.println("A porta já esta aberta!");
		}
	}
	
	public void abrirPortao() {
		if (this.isPortaoEstaAberto() == false) {
			System.out.println("O porteiro " + super.getInformacoesPessoais().getNome() +  " " + super.getInformacoesPessoais().getSobrenome() + " abriu o portão.");
			this.setPortaoEstaAberto(true);
		} else {
			System.out.println("O portão já esta aberto!");
		}
	}
	
	public boolean isPortaEstaAberta() {
		return portaEstaAberta;
	}
	
	public void setPortaEstaAberta(boolean portaEstaAberta) {
		this.portaEstaAberta = portaEstaAberta;
	}
	
	public boolean isPortaoEstaAberto() {
		return portaoEstaAberto;
	}
	
	public void setPortaoEstaAberto(boolean portaoEstaAberto) {
		this.portaoEstaAberto = portaoEstaAberto;
	}
}
