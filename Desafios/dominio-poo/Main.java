import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        
        curso1.setTitulo("Dio Java ");
        curso1.setDescricao("Descrição do curso em Java ");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        
        curso2.setTitulo("Dio Lua ");
        curso2.setDescricao("Descrição do curso em Lua ");
        curso2.setCargaHoraria(8);
        
        System.out.println(curso1.getTitulo() + curso1.getDescricao() + curso1.getCargaHoraria() + " horas de curso");
        System.out.println(curso2.getTitulo() + curso2.getDescricao() + curso2.getCargaHoraria() + " horas de curso");
        
        System.out.println();
        
        Mentoria mentoria1 = new Mentoria();
        
        mentoria1.setTitulo("Mentoria de C++ ");
        mentoria1.setDescricao("Descrição da mentoria de C++ ");
        mentoria1.setData(LocalDate.now());
        
        System.out.println(mentoria1.getTitulo() + mentoria1.getDescricao() + mentoria1.getData());

        System.out.println();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descrição do BootCamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devGustavo.getConteudosInscritos());
        devGustavo.progredir();
        devGustavo.progredir();
        System.out.println("Conteudos Concluidos: " + devGustavo.getConteudosConcluidos());
        System.out.println("XP: " +  devGustavo.calcularTotalXp());

        System.out.println();

        Dev devHeitor = new Dev();
        devHeitor.setNome("Heitor");
        devHeitor.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devHeitor.getConteudosInscritos());
        devHeitor.progredir();
        System.out.println("Conteudos Concluidos: " + devHeitor.getConteudosConcluidos());
        System.out.println("XP: " + devHeitor.calcularTotalXp());

        System.out.println();

          
        
    }
}