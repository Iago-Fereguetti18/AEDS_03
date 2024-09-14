import java.io.File;
import java.time.LocalDate;
import aed3.*;

public class IO {

    public static void main(String[] args) {

        (new File(".\\dados\\pessoas.db")).delete();
        (new File(".\\dados\\pessoas.hash_d.db")).delete();
        (new File(".\\dados\\pessoas.hash_c.db")).delete();
        (new File(".\\dados\\pets.db")).delete();
        (new File(".\\dados\\pets.hash_d.db")).delete();
        (new File(".\\dados\\pets.hash_c.db")).delete();
        // (new File(".\\dados\\tarefas.db")).delete();
        // (new File(".\\dados\\tarefas.hash_d.db")).delete();
        // (new File(".\\dados\\tarefas.hash_c.db")).delete();

        // Pessoa p1 = new Pessoa( "Natal", 4329.34F, LocalDate.of(2024, 12, 25));
        // Pessoa p2 = new Pessoa("Ano novo", 5127.15F, LocalDate.of(1999, 4, 2));
        // Pessoa p3 = new Pessoa("Carlos", 3987.86F, LocalDate.of(2001, 5, 23));
        // Pessoa p;

        Tarefa t1 = new Tarefa("Estudar", LocalDate.of(2024, 9, 13), LocalDate.of(2024, 9, 14), (byte)1, (byte)2);
        Tarefa t2 = new Tarefa("Férias", LocalDate.of(2024, 12, 18), LocalDate.of(2025, 2, 1), (byte)0, (byte)2);
        Tarefa t3 = new Tarefa("Levar a avó no jiu jitsu", LocalDate.of(2024, 9, 17), LocalDate.of(2024, 9, 18), (byte)2, (byte)1);
        Tarefa t4 = new Tarefa("Agredir o Iago", LocalDate.of(2024, 9, 13), LocalDate.of(2024, 9, 14), (byte)0, (byte)2);
        Tarefa t;


        // Pet a1 = new Pet("Totó", LocalDate.of(2021, 10, 3), 2);
        // Pet a2 = new Pet("Naná", LocalDate.of(2019, 3, 30), 3);
        // Pet a;

        try {

            Arquivo<Tarefa> arqTarefas = new Arquivo<>(Tarefa.class.getConstructor(), "tarefas");
            // Arquivo<Pessoa> arqPessoas = new Arquivo<>(Pessoa.class.getConstructor(), "pessoas");
            // Arquivo<Pet> arqPets = new Arquivo<>(Pet.class.getConstructor(), "pets");
            
            // Criação dos objetos
            // arqPessoas.create(p1);
            // arqPessoas.create(p2);
            // arqPessoas.create(p3);

            arqTarefas.create(t1);
            arqTarefas.create(t2);
            arqTarefas.create(t3);
            arqTarefas.create(t4);

            // arqPets.create(a1);
            // arqPets.create(a2);

            // Leitura dos objetos
            //p = arqPessoas.read(1);
            // t = arqTarefas.read(1);
            // if(t!=null)
            //     System.out.println(t);
            // else
            //     System.out.println("Tarefa não encontrada!");

            // a = arqPets.read(2);
            // if(a!=null)
            //     System.out.println(a);
            // else
            //     System.out.println("Pet não encontrado!");

            //Exclusão de pessoa
            // if(arqTarefas.delete(1))
            //     System.out.println("\nTarefa 1 excluída!");
            // else
            //     System.out.println("Não foi possível excluir a Tarefa 1!");
            t = arqTarefas.read(1);
            if(t!=null)
                System.out.println(t);
            else
                System.out.println("Tarefa 1 não encontrada!");
            t = arqTarefas.read(2);
            if(t!=null)
                System.out.println(t);
            else
                System.out.println("Tarefa 2 não encontrada!");

            // arqTarefas.delete(1);
            // arqTarefas.delete(2);
            // arqTarefas.delete(3);
            // arqTarefas.delete(4);


            // a2.nome = "Nanazinha";
            // arqPets.update(a2);
            // a2.nome = "Nana";
            // arqPets.update(a2);
            // a = arqPets.read(2);
            // if(a!=null)
            //     System.out.println(a);
            // else
            //     System.out.println("Pet não encontrado!");



            // Reorganização
            System.out.println("\n\nReorganização do arquivo de Tarefas");
            arqTarefas.reorganizar();
            t = arqTarefas.read(1);
            if(t!=null)
                System.out.println(t);
            else
                System.out.println("Tarefa 1 não encontrada!");
            t = arqTarefas.read(2);
            if(t!=null)
                System.out.println(t);
            else
                System.out.println("Tarefa 2 não encontrada!");
            t = arqTarefas.read(3);
            if(t!=null)
                System.out.println(t);
            else
                System.out.println("Tarefa 3 não encontrada!");
            t = arqTarefas.read(4);
            if(t!=null)
                System.out.println(t);
            else
                System.out.println("Tarefa 4 não encontrada!");

        } catch(Exception e) {
            e.printStackTrace();;
        }

    }
}