package com.github.lucasdevrj.condsystem.comparador;

import java.util.Comparator;

import com.github.lucasdevrj.condsystem.morador.Morador;
/**
 * Classe para comparar Moradores.
 * @author lucas
 *
 */
public class ComparadorMorador implements Comparator<Morador> {

	@Override
	public int compare(Morador m1, Morador m2) {
		String primeiroMorador = m1.getInformacoesPessoais().getCpf();
		String segundoMorador = m2.getInformacoesPessoais().getCpf();
		
		return primeiroMorador.compareTo(segundoMorador);
	}
}
