package ceit.projeto;

import java.util.List;

public class CargaVO {
	private Integer idVeiculo;
	private Integer idEntrega;
	private List<PacoteVO> pacotes;
	
	
	public Integer getIdVeiculo() {
		return idVeiculo;
	}
	public void setIdVeiculo(Integer idVeiculo) {
		this.idVeiculo = idVeiculo;
	}
	public Integer getIdEntrega() {
		return idEntrega;
	}
	public void setIdEntrega(Integer idEntrega) {
		this.idEntrega = idEntrega;
	}
	public List<PacoteVO> getPacotes() {
		return pacotes;
	}
	public void setPacotes(List<PacoteVO> pacotes) {
		this.pacotes = pacotes;
	}
}
