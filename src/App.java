import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Inicialiazação do sistema de clientes:
        ClienteSupermecado clienteSupermecado = new ClienteSupermecado();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        // Adicao de alguns clientes no sistema
        clienteSupermecado.adicionarCliente("12345678901", new Cliente("Pedro Sampaio", "12345678901"));
        clienteSupermecado.adicionarCliente("98765432109", new Cliente("Maria Fernandes", "98765432109"));
        clienteSupermecado.adicionarCliente("11122233344", new Cliente("Pedro Santos", "11122233344"));
        clienteSupermecado.adicionarCliente("55566677788", new Cliente("Ana Pinheiro", "55566677788"));
        clienteSupermecado.adicionarCliente("99988877766", new Cliente("Carlos Nobre", "99988877766"));
        clienteSupermecado.adicionarCliente("33322211100", new Cliente("Julia Santiago", "33322211100"));
        clienteSupermecado.adicionarCliente("44455566677", new Cliente("Mariana Abreu", "44455566677"));
        clienteSupermecado.adicionarCliente("88877766655", new Cliente("Paulo Silva", "88877766655"));
        clienteSupermecado.adicionarCliente("66655544433", new Cliente("Luisa Sonza", "66655544433"));
        clienteSupermecado.adicionarCliente("22233344455", new Cliente("Fernando Abreu", "22233344455"));

        System.out.println("Sistema de Cliente Supermacado BoaCompra.");

        do {
            System.out.println("\nEscolha um item abaixo e digite o numero correspondente (Exemplo: 1):");

            System.out.println("1. Adicionar cliente");
            System.out.println("2. Buscar cliente por CPF");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarCliente(clienteSupermecado, scanner);
                    break;
                case 2:
                    buscarClientePorCPF(clienteSupermecado, scanner);
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }

        } while (opcao != 3);
    }

    public static void adicionarCliente(ClienteSupermecado sistema, Scanner scanner) {
        System.out.println("\nADICIONAR CLIENTE");
        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        Cliente cliente = new Cliente(nome, cpf);
        sistema.adicionarCliente(cpf, cliente);
        System.out.println("Cliente adicionado com sucesso!");
    }

    public static void buscarClientePorCPF(ClienteSupermecado sistema, Scanner scanner) {
        System.out.println("\nBUSCAR CLIENTE POR CPF");
        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();

        Cliente cliente = sistema.getClientePorCPF(cpf);
        if (cliente != null) {
            System.out.println("Cliente encontrado:");
            System.out.println("Nome: " + cliente.getNome());
        } else {
            System.out.println("Cliente nao encontrado.");
        }
    }
}
