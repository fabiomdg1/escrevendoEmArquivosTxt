import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arquivos {

	public static void main(String[] args) throws IOException {

		String nome;
		String email;
		
		File arquivo = new File("C:\\Users\\Acer\\Desktop\\Teste\\teste.txt");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escreverNoArquivo = new FileWriter(arquivo);
		
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		email = JOptionPane.showInputDialog("Digite seu e-mail: ");

		
		escreverNoArquivo.write(nome + "\r\n" + email);
				
//		escreverNoArquivo.write("Inserindo arquivo de texto");
//		escreverNoArquivo.write("\r\n");
//		escreverNoArquivo.write("Segunda Linha de Texto");
		
//		for (int i=1; i < 10; i++) {
//			escreverNoArquivo.write("Texto da linha " + i + "\r\n");
//		}
		
		escreverNoArquivo.flush();
		escreverNoArquivo.close();
	}

}
