import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int contaNumero;
        String agencia;
        String nomeCliente;
        double saldo;

       //TODO: "Conhecer e importar a classe Scanner"

       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Digite o nome do cliente: ");
       nomeCliente = scanner.next();

       System.out.println("Digite o némero da agência com o dígito: ");
       agencia = scanner.next();

       System.out.println("Digite o número da conta: ");
       contaNumero = scanner.nextInt();

       System.out.println("Digite o saldo da conta: ");
       saldo = scanner.nextDouble();

       System.out.println("Olá Sr(a) " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é" + agencia + ", conta " + contaNumero + "e seu saldo " + saldo + " já está disponível para saque" );

       //Exibir as mensagens para nosso usuário




       //Obter pela classe Scanner os valor digitados no terminal


       //Exibir a mensagem da conta criada

    }
}
