import java.io.*;

public class Arquivo {
	private ObjectOutputStream saida;
	private ObjectInputStream entrada;
	private String nomeArq;

	public Arquivo(String nome) {
		nomeArq = nome;
	}

	public void abrir(String tipo) {
		if (tipo.equals("w")) { // abre para gravação
			saida = new ObjectOutputStream(new FileOutputStream(nomeArq));
			System.out.println("Aberto para Gravação");
		} else { // abre para leitura
			entrada = new ObjectInputStream(new FileInputStream(nomeArq));
			System.out.println("Aberto para Leitura");
		}
	}

	public void gravarObjeto(Object obj) {
		saida.writeObject(obj);
		saida.flush();
	}

	public Object lerArquivo() {
		return entrada.readObject();
	}

	public void fechar() {
		saida.close();
		entrada.close();
	}
}
