import java.io.*;

public class Teste {

	public static void main(String [] args) {
		String nomeArq = "Teste.txt";
		try (ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream(nomeArq) );) {
			String obj = "teste - objeto";
			out.writeObject(obj);
			out.flush();
			
		} catch (NotSerializableException e) {
			System.out.println("Objeto não pode ser serializado."); 
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
		}catch (NullPointerException e) {
			System.out.println("Objeto null ou problemas de segurança.");	
		} catch (IOException e) {
			System.out.println("Erro de I/O.");
		}
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream( nomeArq) );) {
			String obj = (String) in.readObject();
			System.out.println(obj);
			
		} catch (StreamCorruptedException e) {
			System.out.println("Arquivo corrompido.");
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo de Leitura não Encontrado.");
		} catch (NullPointerException | SecurityException e) {
			System.out.println("Objeto NULL ou problema de segurança.");
		} catch (ClassNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
		} catch (IOException e) {
			System.out.println("Errooooouuuu!");
		}
	}
}
