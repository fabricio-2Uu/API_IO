import java.io.*;

public class Questao4{
	public static void main(String[] args) {
		File arquivo = new File("Ex4.bin");
		//gravando fluxo baseados em bytes
		
		try (OutputStream saida = new FileOutputStream(arquivo);) {
			byte[] b = {50,51,52,53};
			String string = "Teste com várias palavras";
			saida.write( 53 );
			saida.write( b );
			saida.write( string.getBytes() );	
		} catch (FileNotFoundException e) {
			System.out.println("Erro sei lá do que.");	 
		} catch (IOException e) {
			System.out.println("Erro de I/O.");
		}
		//lendo fluxo baseados em bytes
		
		try (InputStream entrada = new FileInputStream(arquivo);){
			int content;
			while ( (content = entrada.read() ) != -1) {
			    System.out.println( content +" - "+ ( (char) content) );
			}
		} catch (FileNotFoundException e) {
			System.out.println("Erro sei lá do que.");	 
		} catch (IOException e) {
			System.out.println("Erro de I/O.");
		}
		
	}
}
