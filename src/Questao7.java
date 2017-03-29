import java.io.*;

public class Questao7 {
	public static void main(String[] args) {
		File arquivo = new File("Ex7.txt");
		try (PrintWriter escrita = new PrintWriter(arquivo);){
			escrita.println(true);
			escrita.println(10);
			escrita.println(10.20);
			escrita.println("teste");
			escrita.printf("str: %s | double: %.2f | int: %5d ", "teste", 10f, 200);
			
		} catch(IOException e) {
			System.out.println("Erro de I/O.");
		}
	}
}
