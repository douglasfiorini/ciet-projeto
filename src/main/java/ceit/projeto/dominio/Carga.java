package ceit.projeto.dominio;

import java.util.Set;

public class Carga {
    
    private Veiculo veiculo;
    private Entrega entrega;
    private Set<Pacote> pacotes;
    
    
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public Entrega getEntrega() {
        return entrega;
    }
    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }
    public Set<Pacote> getPacotes() {
        return pacotes;
    }
    public void setPacotes(Set<Pacote> pacotes) {
        this.pacotes = pacotes;
    }

}