package it.prova.provafile.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ProvaFile {

	public static void main(String[] args) {
		try {
			FileWriter file1 = new FileWriter("C:/Users/lucia/OneDrive/Desktop/provascritturafile/ciao.txt");
			file1.write("ciao sono Lucia\n");
			file1.close();
			System.out.println("scrittura riuscita");

			BufferedReader read = new BufferedReader(
					new FileReader("C:/Users/lucia/OneDrive/Desktop/provascritturafile/ciao.txt"));
			String line = read.readLine();
			while (line != null) {
				System.out.println(line);
				line = read.readLine();
			}
		} catch (Exception e) {
			System.out.println("eroore durante la creazione");
			e.printStackTrace();
		}

	}

}
