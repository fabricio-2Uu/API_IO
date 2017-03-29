import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Questao12 {
	public static void main(String[] args) {
		Path txt = Paths.get("teste.txt");
		try (BasicFileAttributes info = Files.readAttributes(txt, BasicFileAttributes.class);){
			System.out.format("Data de criação: %s%n", info.creationTime());
			System.out.format("Último acesso: %s%n", info.lastAccessTime());
			System.out.format("Última modificação: %s%n", info.lastModifiedTime());
			System.out.format("É um diretorio: %s%n", info.isDirectory());
			System.out.format("Tamanho: %s bytes%n", info.size());	
		} catch (IOException e) {
			System.out.println("Erro de I/O.");
		}
		
	}
}