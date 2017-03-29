import java.io.*;

public class Questao5 {
	public static void main(String[] args) {
		File arquivo = new File("Ex5.txt");
		// escrevendo dados
		try (FileOutputStream fo = new FileOutputStream(arquivo);
		BufferedOutputStream escrita = new BufferedOutputStream(fo);) {
			escrita.write("teste1".getBytes());
			escrita.write("\n".getBytes());// inserindo um caractere de nova linha
			escrita.write("teste2".getBytes());
			escrita.flush();
		} catch (FileNotFoundException e) {
			System.out.println("Erro de arquivo não encontrado.");
		} catch (IOException e) {
			System.out.println("Erro de I/O.");
		}
		// lendo dados
		try(FileInputStream fi = new FileInputStream(arquivo);
			BufferedInputStream entrada = new BufferedInputStream(fi);) {
			int content;
			while ((content = entrada.read()) != -1) {
				System.out.println(content + " - " + ((char) content));
			}
		}catch (IOException e){
			System.out.println("Erro de I/O.");
		}
	}
}

