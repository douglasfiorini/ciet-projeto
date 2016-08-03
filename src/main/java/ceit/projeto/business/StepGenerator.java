package ceit.projeto.business;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import ceit.projeto.dominio.Pacote;

public class StepGenerator implements IStepGenerator{
	private static final String ZONA_ABASTECIMENTO = "Zona de abastecimento";
	private static final String ZONA_TRANSFERENCIA = "Zona de transferência";
	private static final String VEICULO = "Veículo";
	
	private List<PassoVO> passos = new ArrayList<PassoVO>();
	
	/**
	 * Push specific step to list
	 * @param origin
	 * @param end
	 */
	private void pushStep(Pacote prevPackage, String origin, String end) {
		System.out.println(origin + " -> " + end);
		passos.add(new PassoVO(prevPackage.getId(), origin, end));
	}

	/**
	 * Recursive method responsible for creating steps list
	 * @param origin
	 * @param end
	 * @param transfer
	 */
	private void generateSteps(Stack<Pacote> productsStack, Pacote prevPackage, String origin, String end, String transfer) {
		if(productsStack == null){
			
		}
		
		if(productsStack.size() == 0){	
		
		}
		
		if (productsStack.size() > 0) {
			generateSteps(productsStack, productsStack.pop(), origin, transfer, end);
			pushStep(prevPackage, origin, end);
			generateSteps(productsStack, productsStack.pop(), transfer, end, origin);
		}
	}
	
	public List<PassoVO> generateStep(List<Pacote> pacotes){
		Stack<Pacote> productsStack = new Stack<Pacote>();
		Collections.reverse(pacotes);
		productsStack.addAll(pacotes);
		generateSteps(productsStack, null, ZONA_ABASTECIMENTO, ZONA_TRANSFERENCIA, VEICULO);
		
		return passos;
	}
	

}
