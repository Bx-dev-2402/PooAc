import control.EventoControl;
import model.*;
import view.EventoView;

public class App {
    public static void main(String[] args) {
        Local sala = new Local("Sala 101", 2, "Unidade Barra", "sala");
        sala.setNumeroSala(101);
        sala.setTemMultimidia(true);

        Local aud = new Local("Auditório", 3, "Unidade Barra", "auditorio");
        aud.setTemSom(true);
        aud.setTemTraducao(false);

        Evento palestra = new Evento("Palestra de IA", "10/11/2025", 2, 500.0, "palestra", aud);
        Evento minicurso = new Evento("Minicurso de Java", "12/11/2025", 4, 800.0, "minicurso", sala);
        Evento seminario = new Evento("Minicurso de Java", "15/11/2025", 3, 300.0, "seminario", aud);

        EventoControl control = new EventoControl();
        EventoView view = new EventoView();

        control.configurarPalestra(palestra, "Prof. Thigao", "thiago123@prof.ibmec.edu.br", "ibmec");

        control.configurarMinicurso(minicurso, 8, "Notebook", "IDE", "Apostila");
        control.adicionarInstrutor(minicurso, new Instrutor("Carlos", "carlos@alunos.ibmec.edu.br", "Mestrado", "Java"));
        control.adicionarInstrutor(minicurso, new Instrutor("Bianca", "bianca@alunos.ibmec.edu.br", "Especialização", "Java"));

        control.configurarSeminario(seminario, "Visão Computacional", "João Silva", "Nina Talks");

        control.adicionarOrganizador(palestra, new Organizador("Marcos", "marcos@prof.ibmec.edu.br", "Responsável por inscrições"));

        boolean ok1 = control.inscreverParticipante(minicurso, new Participante("Bernardo", "000", "b@alunos.ibmec.edu.br", "DSAI"));
        boolean ok2 = control.inscreverParticipante(minicurso, new Participante("Lucas", "111", "l@alunos.ibmec.edu.br", "SI"));
        boolean ok3 = control.inscreverParticipante(minicurso, new Participante("João", "222", "j@alunos.ibmec.edu.br", "CC"));
        view.mostrarInscricao(ok1, minicurso.getTitulo());
        view.mostrarInscricao(ok2, minicurso.getTitulo());
        view.mostrarInscricao(ok3, minicurso.getTitulo());


        view.mostrarResumo(palestra);
        view.mostrarResumo(minicurso);
        view.mostrarResumo(seminario);
    }
}
