package com.github.lucasdevrj.condsystem.comparador;

import java.util.Comparator;

import com.github.lucasdevrj.condsystem.funcionario.Colaborador;

public class ComparadorColaborador implements Comparator<Colaborador> {

	@Override
	public int compare(Colaborador c1, Colaborador c2) {
		String primeiroColaborador = c1.getInformacoesPessoais().getCpf();
		String segundoColaborador = c2.getInformacoesPessoais().getCpf();

		return primeiroColaborador.compareTo(segundoColaborador);
	}
}
