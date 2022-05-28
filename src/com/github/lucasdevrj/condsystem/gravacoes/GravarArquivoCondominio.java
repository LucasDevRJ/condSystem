package com.github.lucasdevrj.condsystem.gravacoes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import com.github.lucasdevrj.condsystem.condominio.Condominio;


public class GravarArquivoCondominio {

	public static void gravarConstrucaoPredio(float altura, float largura, int totalAndares, int quantidadeApartamentos, float precoConstrucao) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("Prédio Construído com Sucesso!");
			bw.newLine();
			bw.write("Altura do Prédio: " + altura + " metros");
			bw.newLine();
			bw.write("Largura do Prédio: " + largura + " metros");
			bw.newLine();
			bw.write("Total de Andares: " + totalAndares);
			bw.newLine();
			bw.write("Quantidade de Apartamentos por Andar: " + quantidadeApartamentos);
			bw.newLine();
			bw.write("Custo da Construção: R$ " + precoConstrucao);
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
	
	public static void gravarCompraMetros(float tamanho,float precoCompra) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("Compra de Metros Realizada com Sucesso!");
			bw.newLine();
			bw.write("Metros Comprados: " + tamanho + " metros");
			bw.newLine();
			bw.write("Valor: R$ " + precoCompra);
			bw.newLine();
			bw.write("Tamanho do Condomínio: " + Condominio.getTamanho() + " metros");
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
	
	public static void gravarConstrucaoPiscina(float precoConstrucao, float tamanhoPiscina) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("Construção da Piscina Realizada com Sucesso!");
			bw.newLine();
			bw.write("Valor da Construção: R$ " + precoConstrucao);
			bw.newLine();
			bw.write("Tamanho da Piscina Construido: " + tamanhoPiscina + " metros");
			bw.newLine();
			bw.write("Número Total de Piscinas no Condomínio: " + Condominio.getNumeroPiscinas());
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
	
	public static void gravarConstruirParquinho(float precoConstrucao, float tamanhoParquinho) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("Construção do Parquinho Realizada com Sucesso!");
			bw.newLine();
			bw.write("Valor da Construção: R$ " + precoConstrucao);
			bw.newLine();
			bw.write("Tamanho do Parquinho Construido: " + tamanhoParquinho + " metros");
			bw.newLine();
			bw.write("Número Total de Parquinhos no Condomínio: " + Condominio.getNumeroParquinho());
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
	
	public static void gravaConstruirAcademia(int numeroEquipamentosPartesSuperiores, int numeroEquipamentosPartesInferiores, int numeroEquipamentosTronco, float valorTotal) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("Academia Construida com Sucesso!");
			bw.newLine();
			bw.write("Número de equipamentos das partes superiores: " + numeroEquipamentosPartesSuperiores);
			bw.newLine();
			bw.write("Número de equipamentos das partes tronco: " + numeroEquipamentosTronco);
			bw.newLine();
			bw.write("Número de equipamentos das partes inferiores: " + numeroEquipamentosPartesInferiores);
			bw.newLine();
			bw.write("Custo Total: R$ " + valorTotal);
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
	
}
