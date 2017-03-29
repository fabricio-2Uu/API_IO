import java.io.*;

public class Questao2{
	public static void main(String[] args) {
		//gravando caracteres e Strings
		File arquivoEscrita = new File("Ex2.txt");
		try (FileWriter fw = new FileWriter(arquivoEscrita) ;) {
			fw.write('2');
			fw.write("2");
		}catch(IOException e){
			System.out.println("Erro I/O.");
		}
		//gravando caracteres e Strings
		File arquivoLeitura = new File("Ex2.txt");
		try (FileReader fr = new FileReader(arquivoLeitura);){
			int  c =   fr.read();
			while( c != -1){
			     System.out.print( (char) c );
			    	 c =  fr.read();
				}
			}catch(FileNotFoundException e){
				System.out.println("Arquivo de escrita não encontrado!");
			}catch(IOException e){
				System.out.println("Erro I/O");
			}
		}	
}
