package com.github.lucasdevrj.condsystem.leituras;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeituraArquivo {

	public static void lerArquivo() {
		try {
			File le = new File("arquivos.txt");
			Scanner scanner = new Scanner(le);
			
			String texto = scanner.nextLine();
			
			while (scanner.hasNextLine()) {
				System.out.println(texto);
				texto = scanner.nextLine();
			}
			
			scanner.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
}
