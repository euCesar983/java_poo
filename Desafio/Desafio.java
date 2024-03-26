import java.util.Scanner;

class Desafio {
    public static void main(String[] args) {

        String nome = "Mariana Silva";
        String tipoConta = "Corrente";
        double saldo = 1000.00;
        int opcao = 0;

        System.out.println("********************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n********************************");

        String menu = """
                *** DIGITE SUA OPÇÂO ***
                [1] Consultar saldo
                [2] Transferir valor
                [3] Receber valor
                [4] Sair do programa
                """;

        Scanner scanner = new Scanner(System.in);
        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir? ");
                double valor = scanner.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a tranferência");
                } else {
                    saldo = saldo - valor;
                    System.out.println("Valor transferido com sucesso");
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = scanner.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }

        }

        scanner.close();

    }
}