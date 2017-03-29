
public class Questao1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Informe o número para a tabuada:\n");
		int n = entrada.nextInt();
		System.out.printf("Informe a pasta:\n");
		String pasta = entrada.nextLine();
		FileWriter arq = new FileWriter(pasta+"\\tabuada.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		gravarArq.printf("+--Resultado--+%n");
		for (int i = 1; i <= 10; i++) {
			gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i * n));
		}
		gravarArq.printf("+-------------+%n");
		arq.close();
		System.out.println("\nTabuada do " + n + " foi gravada na " + 
                                                pasta + "\tabuada.txt\n");
	}
}

