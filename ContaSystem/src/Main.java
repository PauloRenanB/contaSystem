import contasystem.conta.Conta;

public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();


        conta1.setNumero(1);
        conta1.setSaldo(10000);
        conta2.setNumero(2);
        conta2.setSaldo(9700);

        System.out.printf("Numero da conta 1: %d%n", conta1.getNumero());
        System.out.printf("Saldo da conta 1: %.2f%n", conta1.getSaldo());
        System.out.printf("Numero da conta 2: %d%n", conta2.getNumero());
        System.out.printf("Saldo da conta 2: %.2f%n", conta2.getSaldo());

    }
}