import java.io.*;

public class Questao6{
	public static void main(String[] args) {
		File arquivo = new File("Ex6.txt");
		try (FileWriter fw = new FileWriter( arquivo );
			 BufferedWriter escrita = new BufferedWriter(fw); ){            
			escrita.write( "teste1" );
			escrita.newLine();
			escrita.write( "teste2");
			escrita.flush();
		} catch (IOException e) {
			System.out.println("Erro de I/O.");
		}
		try (FileReader fr = new FileReader(arquivo);
			BufferedReader leitura = new BufferedReader(fr);) {
			String content;
			while( ( content = leitura.readLine() ) != null){
			    System.out.println( content );
			}
		} catch (FileNotFoundException e) {
			System.out.println("Erro de Arquivo não encontrado.");
		} catch (IOException e) {
			System.out.println("Erro de I/O.");
		}
	}
}
