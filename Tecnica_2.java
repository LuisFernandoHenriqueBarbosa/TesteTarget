import java.util.Scanner;

public class Tecnica_2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite uma string: ");
        String entrada = leia.nextLine();
        
        int quantidadeA = 0;

        for (char i : entrada.toCharArray()) {
            if (i == 'a' || i == 'A') {
                quantidadeA++;
            }
        }

        if (quantidadeA > 0) {
            System.out.println("A letra 'a' aparece " + quantidadeA + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não está presente na string.");
        }

        leia.close();
    }
}
