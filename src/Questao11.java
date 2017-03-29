import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class Questao11 { 
    public static void main(String[] args) {
       FileSystem fs = FileSystems.getDefault();
       List<String> list = criarListaString(); 
       Path diretorio = fs.getPath("C:", "Diretorio", "Teste");
       Path arquivo = diretorio.resolve("teste.txt");
       Charset charset = Charset.forName("UTF-8");
       try {
    	   Files.write(arquivo, list, charset, StandardOpenOption.APPEND);
       }catch (UnsupportedOperationException | SecurityException e){
    	   System.out.println("Operação não suportada ou problema de segurança.");
       }catch (IOException e){
    	   System.out.println("Exceção: I/O - Escrevendo o Arquivo");
       }
       lerArquivo(arquivo, charset);
    }
    private static void lerArquivo(Path arquivo, Charset charset) {
    	try {
		List<String> list = Files.readAllLines(arquivo, charset);
		for (String linha : list) {
			System.out.println(linha);
		}
    	}catch(SecurityException e) {
    		System.out.println("Exceção de Segurança.");
    	}catch(IOException e){
    		System.out.println("Exceção I/O - lendo do arquivo.");
    	}
	
	}
	private static List<String> criarListaString () {
        List<String> list = new ArrayList<String>();
        list.add("ABC"); list.add("DEF"); 
        list.add("GHI"); list.add("JKL");
        list.add("MNO");
        return list; 
    }
}
