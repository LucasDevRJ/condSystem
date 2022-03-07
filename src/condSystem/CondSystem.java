package condSystem;

public interface CondSystem {

	public abstract void acessarInformacoesColaborador(Colaborador colaborador);
	
	public abstract void acessarInformacoesMorador(Morador morador);
	
	public abstract void acessarFinanceiro(Financeiro financeiro, Administrador administrador, Jardineiro jardineiro, Seguranca seguranca, Pedreiro pedreiro, Porteiro porteiro, Eletricista eletricista, ProfessorAcademia professorAcademia);
	
	public abstract void agendarReuniao(String data);
}
