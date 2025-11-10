
package model;

public class Local {

    private String nome;
    private int capacidade;
    private String unidade;
    private String tipo;

    private Integer numeroSala;
    private Boolean temMultimidia;

    private Boolean temSom;
    private Boolean temTraducao;


    private Integer numComputadores;
    private String tipoLaboratorio;

    public Local(String nome, int capacidade, String unidade, String tipo) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.unidade = this.unidade;
        this.tipo = tipo;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getCapacidade() { return capacidade; }
    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }
    public String getUnidade() { return unidade; }
    public void setUnidade(String unidade) { this.unidade = unidade; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public Integer getNumeroSala() { return numeroSala; }
    public void setNumeroSala(Integer numeroSala) { this.numeroSala = numeroSala; }
    public Boolean getTemMultimidia() { return temMultimidia; }
    public void setTemMultimidia(Boolean temMultimidia) { this.temMultimidia = temMultimidia; }

    public Boolean getTemSom() { return temSom; }
    public void setTemSom(Boolean temSom) { this.temSom = temSom; }
    public Boolean getTemTraducao() { return temTraducao; }
    public void setTemTraducao(Boolean temTraducao) { this.temTraducao = temTraducao; }

    public Integer getNumComputadores() { return numComputadores; }
    public void setNumComputadores(Integer numComputadores) { this.numComputadores = numComputadores; }
    public String getTipoLaboratorio() { return tipoLaboratorio; }
    public void setTipoLaboratorio(String tipoLaboratorio) { this.tipoLaboratorio = tipoLaboratorio; }
}
