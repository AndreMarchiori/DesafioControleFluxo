package contagem;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in)) {
			System.out.printf("%n > ");
			int parametroUm = terminal.nextInt();
			int parametroDois = terminal.nextInt();

			contar(parametroUm, parametroDois);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
		}

		int contagemNumero = parametroDois - parametroUm;

		for (int i = 0; i < contagemNumero; i++) {
			System.out.printf("%nImprimindo o numero %d", i + 1);
		}
	}
}

class ParametrosInvalidosException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ParametrosInvalidosException(String mensagem) {
		super(mensagem);
	}
}
