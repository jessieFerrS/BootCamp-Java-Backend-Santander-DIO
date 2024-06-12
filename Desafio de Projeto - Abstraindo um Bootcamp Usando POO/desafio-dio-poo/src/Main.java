import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição do Curso Python");
        curso2.setCargaHoraria(8);

        //POLIMORFISMO -> tudo o que tem em conteudo tem em Curso,
        //mas nem tudo que tem em curso tem em conteudo o mesmo vale para mentoria
        Conteudo conteudo = new Curso();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Live aprendendo Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria Java");
        mentoria2.setDescricao("Live aprendendo Java");
        mentoria2.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("---------------------ANA--------------------");
        System.out.println("Conteudos Inscritos" + devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        System.out.println("-----------------ATUALIZAÇÕES----------------");
        System.out.println("Conteudos Concluidos" + devAna.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos" + devAna.getConteudosInscritos());
        System.out.println("Pontos XP: " + devAna.calcularXP());

        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();


        Dev devBeto = new Dev();
        devBeto.setNome("Beto");
        devBeto.inscreverBootcamp(bootcamp);
        System.out.println("-------------------BETO-------------------");
        System.out.println("Conteudos Inscritos" + devBeto.getConteudosInscritos());
        devBeto.progredir();
        System.out.println("-----------------ATUALIZAÇÕES----------------");
        System.out.println("Conteudos Concluidos" + devBeto.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos" + devAna.getConteudosInscritos());
        System.out.println("Pontos XP: " + devBeto.calcularXP());
        System.out.println("-------------------------------------------");

    }
}