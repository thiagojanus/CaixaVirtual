import java.util.Scanner;


public class CaixaVirtual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();
        Conta outraConta = new Conta();
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Abrir conta");
            System.out.println("2. Fechar conta");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("5. Transferir");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Opção 'Abrir conta' escolhida.");
                    break;
                case 2:
                    System.out.println("Opção 'Fechar conta' escolhida.");
                    break;
                case 3:
                    System.out.print("Digite o valor para depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 4:
                    System.out.print("Digite o valor para sacar: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 5:
                    if (contaCorrente != null && contaPoupanca != null) {
                        System.out.print("Digite o valor para transferir: ");
                        double valorTransferencia = scanner.nextDouble();
                        scanner.nextLine(); // Consumir a nova linha restante após ler o valor double
                        if (contaCorrente.sacar(valorTransferencia)) {
                            contaPoupanca.depositar(valorTransferencia);
                            System.out.println("Transferência de R$" + valorTransferencia + " realizada com sucesso.");
                        } else {
                            System.out.println("Saldo insuficiente para realizar a transferência.");
                        }
                    } else {
                        System.out.println("Não há contas abertas para realizar a transferência!");
                    }
                    break;
                
                public boolean sacar(Double valor) {
                    if (saldo >= valor) {
                        saldo -= valor;
                        return true;
                    }
                    return false;
                }
                case 6:
                    System.out.println("Saindo do caixa virtual...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}