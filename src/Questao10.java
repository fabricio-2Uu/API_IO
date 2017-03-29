import java.io.IOException;
import java.nio.file.*;

public class Questao10 {
	public static void main(String[] args) {
		FileSystem fs = FileSystems.getDefault();
		Path diretorio = null;
		try {
			diretorio = fs.getPath("C:",  "Arquivos de Programas", "Teste");
		} catch(InvalidPathException e){
			System.out.println("Path Invalido!");
		}
		Path arquivo = diretorio.resolve("Teste.txt");
		try {
			Files.createDirectories(diretorio);
		}catch(UnsupportedOperationException | FileAlreadyExistsException e) {
			System.out.println("Exceção: Operação não permitida.");
		}catch(IOException e) {
			System.out.println("Exceção: I/O");
		}
		try {
			Files.createFile(arquivo);
		}catch(UnsupportedOperationException | FileAlreadyExistsException e) {
			System.out.println("Exceção: Operação não permitida.");
		}catch(IOException e) {
			System.out.println("Exceção: I/O");
		}
	}
}
