import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        /**
         * Scanner recebe dados como entrada 
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem-Vindo! Digite o número da Agência.");
        String agencia = scan.next();

        System.out.println("Digite o número da Conta.");
        int conta = scan.nextInt();

        System.out.println("Digite seu nome.");
        String nome = scan.next();

        System.out.println("Por favor, digite o saldo.");
        double saldo = scan.nextDouble();

        System.out.println("Parabens " + nome + ", obrigado por criar uma conta em nosso banco! \nSua agência é: " + agencia + ", conta: " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}