import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int contaNumero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner tec = new Scanner(System.in);
       
       System.out.print("Digite o nome do cliente: ");
       nomeCliente = tec.next();

       System.out.print("Digite o número da agência com o dígito: ");
       agencia = tec.next();

       System.out.print("Digite o número da conta: ");
       contaNumero = tec.nextInt();

       System.out.print("Digite o saldo da conta: ");
       saldo = tec.nextDouble();
       System.out.println();

       System.out.printf("Olá Sr(a) %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",  nomeCliente, agencia, contaNumero, saldo);

       tec.close();

      
    }
}
