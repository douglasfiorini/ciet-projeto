package ceit.projeto.business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ceit.projeto.dominio.Pacote;


public class StepGeneratorTest {

	
	public void retorna_passos_movimentacao_carga(){
		List<Pacote> lst = new ArrayList<>();
		lst.add(new Pacote(1l, 1l));
		lst.add(new Pacote(1l, 2l));
		lst.add(new Pacote(1l, 3l));
		lst.add(new Pacote(1l, 5l));
		lst.add(new Pacote(1l, 6l));
		
		List<PassoVO> generatedStep = new StepGenerator().generateStep(lst);
	}
	
}
