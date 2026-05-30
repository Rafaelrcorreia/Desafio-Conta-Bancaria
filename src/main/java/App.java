import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria();

        System.out.println("Digite o número da conta: ex:0000 ");
        conta1.setNumeroDaConta(sc.nextInt());
        System.out.println("Digite a agência: ex:000-0 ");
        conta1.setAgencia(sc.next());
        System.out.println("Digite o nome do cliente: ex:João ");
        conta1.setNomeDoCliente(sc.next());
        System.out.println("Digite o saldo: ex:1000.00 ");
        conta1.setSaldo(sc.nextDouble());

        System.out.println("Olá, " + conta1.getNomeDoCliente() + " seu número de conta é: " + conta1.getNumeroDaConta() + " e sua agência é: " + conta1.getAgencia() + " e seu saldo é: R$" + conta1.getSaldo());

    }
}
