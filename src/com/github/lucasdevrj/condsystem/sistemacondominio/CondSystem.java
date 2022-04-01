package com.github.lucasdevrj.condsystem.sistemacondominio;

import com.github.lucasdevrj.condsystem.funcionario.Colaborador;
import com.github.lucasdevrj.condsystem.morador.Morador;
import com.github.lucasdevrj.condsystem.financeiro.Financeiro;

public interface CondSystem {

	public abstract void acessarInformacoesColaborador(Colaborador colaborador);
	
	public abstract void acessarInformacoesMorador(Morador morador);
	
	public abstract void acessarFinanceiro(Financeiro financeiro);
	
	public abstract void agendarReuniao(String data);
}
