package model;

public class Instrutor {
    private String nome;
    private String email;
    private String formacao;
    private String area;

    public Instrutor(String nome, String email, String formacao, String area) {
        this.nome = nome;
        this.email = email;
        this.formacao = formacao;
        this.area = area;
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getFormacao() { return formacao; }
    public String getArea() { return area; }

    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }
    public void setFormacao(String formacao) { this.formacao = formacao; }
    public void setArea(String area) { this.area = area; }
}
