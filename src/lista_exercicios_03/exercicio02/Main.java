package lista_exercicios_03.exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um instrumento:");
        System.out.println("1 - Guitarra");
        System.out.println("2 - Bateria");
        System.out.println("3 - Piano");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        Instrumento instrumento;

        switch (opcao) {
            case 1: instrumento = new Guitarra(); break;
            case 2: instrumento = new Bateria();  break;
            case 3: instrumento = new Piano();    break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        instrumento.tocar();
        scanner.close();
    }
}
