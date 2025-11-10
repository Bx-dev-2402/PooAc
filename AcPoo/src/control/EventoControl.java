package control;

import model.Evento;
import model.Instrutor;
import model.Organizador;
import model.Participante;

public class EventoControl {

    // cadastra infos específicas conforme o tipo do evento
    public void configurarPalestra(Evento e, String nome, String email, String inst) {
        e.setPalestraDados(nome, email, inst);
    }

    public void configurarMinicurso(Evento e, int cargaHoraria, String... materiais) {
        e.setCargaHorariaMinicurso(cargaHoraria);
        for (String m : materiais) {
            e.getMateriais().add(m);
        }
    }

    public void adicionarInstrutor(Evento e, Instrutor i) {
        e.getInstrutores().add(i);
    }

    public void configurarSeminario(Evento e, String tema, String aluno, String orientador) {
        e.setSeminarioDados(tema, aluno, orientador);
    }

    public void adicionarOrganizador(Evento e, Organizador o) {
        e.getOrganizadores().add(o);
    }

    public boolean inscreverParticipante(Evento e, Participante p) {
        return e.inscrever(p);
    }
}
