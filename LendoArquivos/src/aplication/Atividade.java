package aplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;
import java.util.Locale;

public class Atividade {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// ler caminho de um arquivo
		String[] line1 = new String[] { "TV Samsungo,1290.99,1", "TV OVO,350.50,3" };
		// String[] partes = line1.split(",");
		String ativi = "c:\\temp";
		boolean sucess = new File(ativi + "\\out").mkdir();
		System.out.println("Creat: " + sucess);
		String crioradd = ("c:\\temp\\out\\summary.csv");

		File mostrarcaminho = new File("c:\\temp\\out\\summary.csv");
		try (BufferedReader br = new BufferedReader(new FileReader(ativi))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			e.getStackTrace();
		}
		// Adicionar um arquivo ou uma atualização de dados de um arquivo
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(crioradd,true))) {
			for (String elementos : line1) {
				String[] partes = elementos.split(",");

				Double preco = Double.parseDouble(partes[1]);
				int quantidade = Integer.parseInt(partes[2]);
				double total = preco * quantidade;
				System.out.println(partes[0] + ", " + String.format("%.2f", total));
				bw.write(elementos);
				bw.newLine();

			}

			System.out.println(mostrarcaminho.getPath());

		} catch (IOException e) {
			e.getStackTrace();
		}
	}

}
