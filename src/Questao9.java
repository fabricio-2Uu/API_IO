import java.io.*;
import java.util.Scanner;

public class Questao9 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o nome do arquivo:");
		String nomeArq = in.next();
		System.out.println("Informe uma opção:\n1 – Criar arquivo\n2 – Excluir arquivo\nInforme uma opção:");
		int opcao = in.nextInt();
		File f = new File(nomeArq);
		switch (opcao) {
		case 1:
			try {
				if (f.createNewFile() == true)
					System.out.println("Arquivo " + nomeArq + "foi criado");
				else
					System.out.println("Arquivo " + nomeArq + " existente");
			} catch (IOException e) {
				System.out.println("Erro de algo.");
			}
			break;
		case 2:
			if (f.exists()) {
				f.delete();
				System.out.println("Arquivo " + nomeArq + " foi removido");
			}
			break;
		}
		in.close();
		Util.dirList(".");
	}
}

class Util {
	public static void dirList(String pasta) {
		File path = new File(pasta);
		String[] list = path.list();
		for (String item : list)
			System.out.println(item);
	}
}
