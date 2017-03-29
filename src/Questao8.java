import java.io.*;
import java.util.Scanner;

public class Questao8 {
	public static void main(String[] args) {
		File arquivo = new File("Ex8.bin");
		try (InputStream in = new FileInputStream(arquivo);){
			Scanner scan = new Scanner(in);
			while (scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
		} catch(IOException e ){
			System.out.println("Erro de I/O.");
		}
	}
}
