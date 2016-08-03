package ceit.projeto.business;

import java.util.List;

import ceit.projeto.dominio.Pacote;

public interface IStepGenerator {
	public List<PassoVO> generateStep(List<Pacote> pacotes);
}
