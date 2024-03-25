import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero de 0 a 10 ");
            int palpite = leitura.nextInt();
            int adivinhar = random.nextInt(10);

            if (palpite == adivinhar) {
                System.out.println("Você acertou!");
                break;
            } else {
                System.out.println("Você errou!");
            }

        }

        leitura.close();
    }
}
