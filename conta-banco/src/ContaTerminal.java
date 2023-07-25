import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int Numero;
        String Agencia, nomeCliente;
        double Saldo;
		
		System.out.println("Por favor, informe seu nome!");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o número da Agência!");
        Agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da Conta!");
		Numero = sc.nextInt();
        System.out.println("Por favor, digite seu saldo!");
		Saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é: "+ Agencia +", conta: "+ Numero +"e seu saldo é de: " + Saldo);
        sc.close();
    }
}
