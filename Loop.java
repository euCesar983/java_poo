import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;

        /**
         * i - inicializa com zero
         * i - determina condição
         * i - incrementaçãos
         * 
         * o loop será executado até determinada condição
         */
        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para esse filme");
            nota = leitura.nextDouble();
            /**
             * media = media + nota
             */
            media += nota;
        }
        System.out.println("Média de avaliação: " + media / 3);

        leitura.close();
    }
}
