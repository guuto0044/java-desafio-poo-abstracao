import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("==== Agenda do Aluno ====");

        Devs desenvolvedor = new Devs();
        desenvolvedor.setNome("Augusto");
        desenvolvedor.setIdade(24);
        System.out.println("Desenvolvedor: " + desenvolvedor.getNome());
        System.out.println("Idade: " + desenvolvedor.getIdade());
        
        System.out.println("==== Cursos em Atividade ====");

        //Bootcamp bootcamp = new Cursos();

        Cursos curso1 = new Cursos();
        curso1.setTitulo("Java Basico");
        curso1.setCargaHoraria(2);
        System.out.println(curso1.getTitulo() + " - " + curso1.getCargaHoraria() + " Horas");
        
        Cursos curso2 = new Cursos();
        curso2.setTitulo("Java Médio");
        System.out.println(curso2.getTitulo());


        System.out.println("==== Mnetoria ==== ");

        Mentorias mentoria = new Mentorias();
        mentoria.setTitulo("Mentoria de Java Básico ao Avançado");
        mentoria.setDescricao("Materia perfeita para o aprendizado em desenvolvimento.");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

        Mentorias mentoria2 = new Mentorias();
        mentoria2.setTitulo("Mentoria de Java com IA");
        mentoria2.setDescricao("Materia perfeita para o aprendizado.");
        mentoria2.setData(LocalDate.now());
        System.out.println(mentoria2);
        

    }
}
