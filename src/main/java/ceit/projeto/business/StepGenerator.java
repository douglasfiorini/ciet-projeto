package ceit.projeto.business;
import java.util.List;
import java.util.Scanner;

import ceit.projeto.dominio.Pacote;

public class StepGenerator implements IStepGenerator{
	
	/**
	 * Push specific step to list
	 * @param origin
	 * @param end
	 */
	private static void pushStep(String origin, String end) {
		System.out.println(origin + " -> " + end);
	}

	/**
	 * Recursive method responsible for creating steps list
	 * @param origin
	 * @param middle
	 * @param end
	 */
	private void generateSteps(int n, String origin, String middle, String end) {

		if (n > 0) {
			generateSteps(n - 1, origin, end, middle);
			pushStep(origin, middle);
			generateSteps(n - 1, end, middle, origin);
		}

	}
	
	public List<PassoVO> generateStep(List<Pacote> pacotes){
		
		
		return null;
	}

	// executando o hanoi
	public static void main(String[] args) {

		int n; // número de discos

		// recebe o número de discos digitado pelo usuário
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número de discos: ");
		n = entrada.nextInt();

		// executa o hanoi!
//		TorresDeHanoi.hanoi(n, 1, 3, 2);
	}
	

}
