import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite Seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número da sua agencia : ");
        String agencia = scanner.next();

        System.out.println("Digite Seu Saldo");
        Double Saldo = scanner.nextDouble();

        // int numero;
        // String agencia;
        // Double Saldo;
     
        System.out.println("Olá " + nomeCliente + " Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " E o seu Saldo é: " + Saldo + " Já esta disponivel para saque!!!");
    }
}
