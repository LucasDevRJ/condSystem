package com.github.lucasdevrj.condsystem.leituras;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeituraArquivo {

	public static void ler(float largura,float altura,int totalAndares,int quantidadeApartamentos,float precoConstrucao) {
		try {
			FileInputStream fis = new FileInputStream("arquivos.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			String linha = br.readLine();
			
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
	
	public static void ler(float tamanho,float precoCompra) {
		try {
			FileInputStream fis = new FileInputStream("arquivos.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			String linha = br.readLine();
			
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
}
