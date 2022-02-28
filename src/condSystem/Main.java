package condSystem;

public class Main {

	public static void main(String[] args) {
		InformacoesPessoais ipp = new InformacoesPessoais();
		ipp.setNome("Tulio");
		ipp.setSobrenome("Neto");
		
		Porteiro pt = new Porteiro();
		pt.setInformacoesPessoais(ipp);
		pt.setSalario(2000.0f);
		
		Apartamento apt = new Apartamento();
		apt.setPrecoAlguel(700.0f);
		
		Apartamento apt2 = new Apartamento();
		apt2.setPrecoAlguel(600.0f);
		
		Apartamento apt3 = new Apartamento();
		apt3.setPrecoAlguel(900.0f);
		
		Receita rt = new Receita();
		rt.setAluguel(apt);
		rt.setAluguel(apt);
		rt.setAluguel(apt);
		
		System.out.println(rt.getTotal());
		System.out.println(rt.getTotal());
		System.out.println(rt.getTotal());
		System.out.println(rt.getTotal());
		
		Despesa dp = new Despesa();
		dp.setAgua(300);
		dp.setEletricidade(400);
		dp.setGas(600);
		dp.setImposto(1000);
		
		System.out.println("Despesas totais: " + dp.getTotal());
		
		Financeiro fn = new Financeiro();
		
		Administrador adm = new Administrador();
		//adm.acessarInformacoesColaborador(pt);
	
	}
}
