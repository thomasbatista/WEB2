package lista_exercicios.exercicio03.test;

import lista_exercicios.exercicio03.domain.Tarefa;
import java.util.ArrayList;
import java.util.Scanner;

public class TarefaTest {
    public static void main(String[] args) {
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== GERENCIADOR DE TAREFAS =====");
            System.out.println("a. Adicionar uma tarefa");
            System.out.println("b. Remover uma tarefa");
            System.out.println("c. Listar todas as tarefas");
            System.out.println("d. Sair");
            System.out.print("Escolha uma opção: ");
            String entrada = scanner.nextLine().trim().toLowerCase();

            switch (entrada) {
                case "a":
                    System.out.print("Código da tarefa: ");
                    int codigo = Integer.parseInt(scanner.nextLine().trim());

                    System.out.print("Título da tarefa: ");
                    String titulo = scanner.nextLine().trim();

                    tarefas.add(new Tarefa(codigo, titulo));
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case "b":
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                        break;
                    }

                    System.out.print("Código da tarefa a remover: ");
                    int codigoRemover = Integer.parseInt(scanner.nextLine().trim());

                    boolean removida = false;
                    for (int i = 0; i < tarefas.size(); i++) {
                        if (tarefas.get(i).getCodigo() == codigoRemover) {
                            tarefas.remove(i);
                            System.out.println("Tarefa removida com sucesso!");
                            removida = true;
                            break;
                        }
                    }

                    if (!removida) {
                        System.out.println("Tarefa com código " + codigoRemover + " não encontrada.");
                    }
                    break;

                case "c":
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        System.out.println("\n--- Lista de Tarefas ---");
                        for (Tarefa t : tarefas) {
                            System.out.println(t);
                        }
                    }
                    break;

                case "d":
                    System.out.println("Saindo... Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            opcao = entrada.equals("d") ? 0 : 1;

        } while (opcao != 0);

        scanner.close();
    }
}
