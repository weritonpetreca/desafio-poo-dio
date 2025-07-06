import com.petreca.desafio.dominio.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Aprenda os conceitos básicos de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Aprenda os conceitos básicos de JavaScript");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Sessão de perguntas e respostas sobre Java");
        mentoria.setData(java.time.LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda Java do zero ao avançado");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWeriton = new Dev();
        devWeriton.setNome("Weriton Petreca");
        devWeriton.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devWeriton.getNome() + ": " + devWeriton.getConteudosInscritos());
        devWeriton.progredir();
        devWeriton.progredir();
        devWeriton.progredir();
        System.out.println("--------------------");
        System.out.println("Conteúdos Inscritos " + devWeriton.getNome() + ": " + devWeriton.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devWeriton.getNome() + ": " + devWeriton.getConteudosConcluidos());
        System.out.println("XP: " + devWeriton.calcularTotalXP());

        System.out.println("---------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João da Silva");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devJoao.getNome() + ": " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("--------------------");
        System.out.println("Conteúdos Inscritos " + devJoao.getNome() + ": " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devJoao.getNome() + ": " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXP());
    }
}