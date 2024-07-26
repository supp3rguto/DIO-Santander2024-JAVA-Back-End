import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Descrição curso Java", 8);
        Curso curso2 = new Curso("Curso JS", "Descrição curso JS", 4);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Descrição mentoria Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.adicionarConteudo(curso1);
        bootcamp.adicionarConteudo(curso2);
        bootcamp.adicionarConteudo(mentoria);

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        mostrarProgresso(devCamila);
        devCamila.progredir();
        devCamila.progredir();
        mostrarProgresso(devCamila);
        recompensarDev(devCamila);

        System.out.println("-------");

        Dev devAugusto = new Dev("Augusto");
        devAugusto.inscreverBootcamp(bootcamp);
        mostrarProgresso(devAugusto);
        devAugusto.progredir();
        devAugusto.progredir();
        devAugusto.progredir();
        mostrarProgresso(devAugusto);
        recompensarDev(devAugusto);
    }

    public static void mostrarProgresso(Dev dev) {
        System.out.println("Conteúdos Inscritos " + dev.getNome() + ": " + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + dev.getNome() + ": " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());
    }

    public static void recompensarDev(Dev dev) {
        if (dev.getConteudosInscritos().isEmpty()) {
            System.out.println(dev.getNome() + " concluiu todos os conteúdos e recebeu uma recompensa!");
        } else {
            System.out.println(dev.getNome() + " ainda não concluiu todos os conteúdos.");
        }
    }
}
