import java.util.Scanner;

public class Tecnica_1{
    public static void main(String[] args) {
        int soma = 0;

        Scanner leia = new Scanner(System.in);
        int numeroDigitado = 0;
        do {
            System.out.println("Digite um número para ser somado:");
            numeroDigitado = leia.nextInt();

            if (numeroDigitado >= 0) {
                soma = soma + numeroDigitado;

                if (belongsToFibonacci(soma)) {
                    System.out.println("O número digitado pertence à sequência de Fibonacci.");
                } else {
                    System.out.println("O número não pertence à sequência de Fibonacci.");
                }
            }
        } while (numeroDigitado >= 0);

        System.out.println("Número inválido.");
        leia.close();
    }

    public static boolean belongsToFibonacci(int n) {
        int a = 0, b = 1;

        if (n == a || n == b) {
            return true;
        }

        int proximo = a + b;
        while (proximo <= n) {
            if (proximo == n) {
                return true;
            }
            a = b;
            b = proximo;
            proximo = a + b;
        }

        return false;
    }
}