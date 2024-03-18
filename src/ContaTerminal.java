import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner insert = new Scanner(System.in);
        System.out.println("Seja bem vindo ao seu novo banco! \n Para começar precisamos de algumas informações. \n Primeiro digite o seu nome e sobrenome.");
        String nome = insert.nextLine();
        System.out.println("Digite o número da sua agência.");
        String agencia = insert.next();
        System.out.println("Agora digite o número da sua conta.");
        int numeroConta = insert.nextInt();
        System.out.println("Agora digite o seu saldo atual.");
        double saldo = insert.nextDouble();

        System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numeroConta +" e seu saldo de R$" + saldo +" já está disponível para saque.");
        insert.close();
    }
}
