import java.io.*;

public class Questao3 {
	public static void main(String[] args) {
		File arquivo = new File("teste.txt");
		try (FileReader fr = new FileReader(arquivo);){
			char[]  c =  new char[4];
			fr.read(c);
			System.out.print( c );
			fr.close();
		} catch (IOException e) {
			System.out.println("Erro de I/O");
		}

	}
}
