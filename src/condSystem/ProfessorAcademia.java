package condSystem;

public class ProfessorAcademia extends Colaborador {

	private boolean estaMontandoSerie;
	
	public void montarSerie() {
		if (this.isEstaMontandoSerie() == false) {
			System.out.println("Professor de Educa��o F�sica " + super.getInformacoesPessoais().getNome() + super.getInformacoesPessoais().getSobrenome() + " esta montando s�rie para o aluno.");
		} else {
			System.out.println("Professor de Educa��o F�sica " + super.getInformacoesPessoais().getNome() + super.getInformacoesPessoais().getSobrenome() + " j� montou a s�rie para o aluno.");
		}
	}
	 
	public void demonstrarExercicio() {
		System.out.println("Professor de Educa��o F�sica " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta demonstrando o exerc�cio para o aluno.");
	}

	public boolean isEstaMontandoSerie() {
		return estaMontandoSerie;
	}

	public void setEstaMontandoSerie(boolean estaMontandoSerie) {
		this.estaMontandoSerie = estaMontandoSerie;
	}
}
