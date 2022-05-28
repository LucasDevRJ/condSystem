package com.github.lucasdevrj.condsystem.gravacoes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import com.github.lucasdevrj.condsystem.funcionario.Colaborador;

public class GravarArquivoColaborador {

	public static void gravaRecebimentoSalario(Colaborador colaborador) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("Salário Depositado com Sucesso!");
			bw.newLine();
			bw.write("Valor Depositado: R$ " + colaborador.getProfissao().getSalario());
			bw.newLine();
			bw.write("Saldo Total: R$ " + colaborador.getTitular().getSaldo());
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
}
