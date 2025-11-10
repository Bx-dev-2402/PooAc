package model;

import java.util.ArrayList;

public class Evento {
    private String titulo;
    private String data;
    private int duracaoHoras;
    private double orcamento;
    private String tipoEvento;
    private Local local;

    private ArrayList<Participante> inscritos = new ArrayList<>();

    private String palestranteNome;
    private String palestranteEmail;
    private String palestranteInstituicao;

    private int cargaHorariaMinicurso;
    private ArrayList<String> materiais = new ArrayList<>();
    private ArrayList<Instrutor> instrutores = new ArrayList<>();

    private String temaSeminario;
    private String nomeAlunoApresentador;
    private String nomeOrientador;

    private ArrayList<Organizador> organizadores = new ArrayList<>();

    public Evento(String titulo, String data, int duracaoHoras, double orcamento, String tipoEvento, Local local) {
        this.titulo = titulo;
        this.data = data;
        this.duracaoHoras = duracaoHoras;
        this.orcamento = orcamento;
        this.tipoEvento = tipoEvento;
        this.local = local;
    }

    public boolean inscrever(Participante p) {
        if (inscritos.size() < local.getCapacidade()) {
            inscritos.add(p);
            return true;
        }
        return false;
    }

    public int vagasRestantes() {
        return local.getCapacidade() - inscritos.size();
    }

    public String getTitulo() { return titulo; }
    public String getTipoEvento() { return tipoEvento; }
    public Local getLocal() { return local; }
    public ArrayList<Participante> getInscritos() { return inscritos; }
    public ArrayList<String> getMateriais() { return materiais; }
    public ArrayList<Instrutor> getInstrutores() { return instrutores; }
    public ArrayList<Organizador> getOrganizadores() { return organizadores; }

    public void setPalestraDados(String nome, String email, String instituicao) {
        this.palestranteNome = nome;
        this.palestranteEmail = email;
        this.palestranteInstituicao = instituicao;
    }
    public String getPalestranteResumo() {
        return palestranteNome + " (" + palestranteInstituicao + ")";
    }

    public void setSeminarioDados(String tema, String aluno, String orientador) {
        this.temaSeminario = tema;
        this.nomeAlunoApresentador = aluno;
        this.nomeOrientador = orientador;
    }
    public String getSeminarioResumo() {
        return temaSeminario + " - " + nomeAlunoApresentador + " / Orient.: " + nomeOrientador;
    }

    public void setCargaHorariaMinicurso(int h) { this.cargaHorariaMinicurso = h; }
    public int getCargaHorariaMinicurso() { return cargaHorariaMinicurso; }
}
