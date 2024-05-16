import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número da conta! ");
    int numero = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Por favor, digite o número da agência! ");
    String numeroAngencia = scanner.nextLine();

    System.out.println("Por favor, digite o nome do titular! ");
    String nomeCliente = scanner.nextLine();

    System.out.println("Por favor, digite o saldo da conta: ");
    double saldoConta = scanner.nextDouble();

    System.out.println(
      "Olá " +
      nomeCliente +
      ", obrigado por criar uma conta em nosso banco, sua agência é " +
      numeroAngencia +
      ", conta " +
      numero +
      " e seu saldo " +
      saldoConta +
      " já esta disponível para saque!"
    );
  }
}
