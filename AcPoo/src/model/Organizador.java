package model;

public class Organizador {
    private String nome;
    private String email;
    private String funcao;

    public Organizador(String nome, String email, String funcao) {
        this.nome = nome;
        this.email = email;
        this.funcao = funcao;
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getFuncao() { return funcao; }

    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }
    public void setFuncao(String funcao) { this.funcao = funcao; }
}