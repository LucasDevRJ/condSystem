package com.github.lucasdevrj.condsystem.gravacoes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class GravarArquivo {
	
	public static void gravar(float altura, float largura, int totalAndares, int quantidadeApartamentos, float precoConstrucao) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("Pr�dio Constru�do com Sucesso!");
			bw.newLine();
			bw.write("Altura do Pr�dio: " + altura + " metros");
			bw.newLine();
			bw.write("Largura do Pr�dio: " + largura + " metros");
			bw.newLine();
			bw.write("Total de Andares: " + totalAndares);
			bw.newLine();
			bw.write("Quantidade de Apartamentos por Andar: " + quantidadeApartamentos);
			bw.newLine();
			bw.write("Custo da Constru��o: R$ " + precoConstrucao);
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
}
