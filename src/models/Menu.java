package models;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private ContaTerminal conta;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("Bem-vindo ao sistema bancário.");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Exibir detalhes da conta");
        System.out.println("0 - Sair");

        int opcao;
        do {
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> criarConta();
                case 2 -> exibirDetalhesConta();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private void criarConta() {
        System.out.println("Digite o número do usuário: ");
        String usuario = scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o seu saldo bancário: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        conta = new ContaTerminal(usuario, agencia, nome, saldo);
        System.out.println("Conta criada com sucesso!");
    }

    private void exibirDetalhesConta() {
        if (conta != null) {
            conta.exibirDetalhes();
        } else {
            System.out.println("Nenhuma conta criada. Por favor, crie uma conta primeiro.");
        }
    }
}
