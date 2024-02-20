import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name = "Samuel";
        String account = "Corrente";
        double balance = 2500.00;
        int opcao;

        System.out.println("""
                ***********************
                Nome: %s
                Tipo de conta: %s
                Saldo inicial: R$ %.2f

                ***********************
                """.formatted(name, account, balance));

        do {
            System.out.println("""

                    Operações

                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair

                    """);

            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O saldo atual é: R$ " + String.format("%.2f", balance));
                    break;
                case 2:
                    System.out.print("Informe o valor a receber: ");
                    double amount = sc.nextDouble();
                    balance += amount;
                    System.out.println("Saldo atualizado R$ " + String.format("%.2f", balance));
                    break;
                case 3:
                    System.out.print("Informe o valor que deseja transferir: ");
                    amount = sc.nextDouble();
                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Saldo atualizado R$ " + String.format("%.2f", balance));
                    } else {
                        System.out.println("Não há saldo suficiente para fazer essa transferência");
                    }
                    break;
                case 4:
                    break;

            }

        } while (opcao != 4);

        sc.close();
    }
}
