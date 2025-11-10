package view;

import model.Evento;
import model.Participante;

public class EventoView {
    public void mostrarResumo(Evento e) {
        System.out.println("=== Evento: " + e.getTitulo() + " (" + e.getTipoEvento() + ") ===");
        System.out.println("Local: " + e.getLocal().getNome() + " | Vagas restantes: " + e.vagasRestantes());

        if (e.getTipoEvento().equals("palestra")) {
            System.out.println("Palestrante: " + e.getPalestranteResumo());
        } else if (e.getTipoEvento().equals("minicurso")) {
            System.out.println("Carga horária: " + e.getCargaHorariaMinicurso() + "h");
            System.out.println("Materiais: " + e.getMateriais());
            System.out.println("Instrutores: " + e.getInstrutores().size());
        } else if (e.getTipoEvento().equals("seminario")) {
            System.out.println("Seminário: " + e.getSeminarioResumo());
        }

        System.out.println("Inscritos:");
        for (Participante p : e.getInscritos()) {
            System.out.println(" - " + p.getNome());
        }
        System.out.println();
    }

    public void mostrarInscricao(boolean ok, String nomeEvento) {
        if (ok) System.out.println("Inscrição realizada com sucesso em " + nomeEvento);
        else System.out.println("Sem vagas disponíveis para " + nomeEvento);
    }
}