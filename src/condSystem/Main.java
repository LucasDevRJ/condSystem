package condSystem;

public class Main {

	public static void main(String[] args) {
		InformacoesPessoais ipp = new InformacoesPessoais();
		ipp.setNome("Tulio");
		ipp.setSobrenome("Neto");
		
		Porteiro pt = new Porteiro();
		pt.setInformacoesPessoais(ipp);
		//pt.setSalario(2000.0f);
		
		Apartamento apt = new Apartamento();
		apt.setPrecoAlguel(700.0f);
		
		Apartamento apt2 = new Apartamento();
		apt2.setPrecoAlguel(600.0f);
		
		Apartamento apt3 = new Apartamento();
		apt3.setPrecoAlguel(900.0f);
		
		Receita rt = new Receita();
		rt.receitaTotal(apt);
		rt.receitaTotal(apt2);
		rt.receitaTotal(apt3);
		
		Despesa dp = new Despesa();
		dp.setAgua(300);
		//dp.setEletricidade(400);
		//dp.setGas(400);
		//dp.setImposto(200);
		dp.totalDespesa();
		
		System.out.println("Despesas totais: " + dp.getTotal());
		
		Custo ct = new Custo();
		//ct.setConsertos(206);
		ct.setConstrucao(500);
		//ct.setMaterialConstrucao(800);
		ct.custoTotal();
		
		System.out.println("Custos Totais = " + ct.getTotal());
		
		Financeiro fn = new Financeiro();
		fn.setReceita(rt);
		fn.setDespesa(dp);
		fn.setCusto(ct);
		fn.lucroTotal();
		
		Administrador adm = new Administrador();
		//adm.acessarInformacoesColaborador(pt);
		adm.acessarFinanceiro(fn);
		
		Profissao profissao1 = new Profissao();
		profissao1.setSalario(4000.0f);
		profissao1.setCargo("Administrador");
		
		Conta conta = new Conta();
		
		Morador morador1 = new Morador();
		morador1.setProfissao(profissao1);
		morador1.setTitular(conta);
		
		conta.depositar(2000.0f, morador1);
		
		morador1.setTitular(conta);
		morador1.reformarApartamento(1);
		
		System.out.println(conta.getSaldo());
		
		System.out.println(morador1.getProfissao());
		
		//morador1.receberSalario();
		
		System.out.println(conta.getSaldo());
		
		Profissao pfSeguranca = new Profissao();
		pfSeguranca.setSalario(2650.0f);
		
		Conta ctSeguranca = new Conta();
		
		Seguranca seguranca = new Seguranca();
		seguranca.setProfissao(pfSeguranca);
		seguranca.setTitular(ctSeguranca);
		
		System.out.println(seguranca.getTitular().getSaldo());
		seguranca.receberSalario();
		System.out.println(seguranca.getTitular().getSaldo());
		seguranca.receberSalario();
		System.out.println(seguranca.getTitular().getSaldo());
	}
}
