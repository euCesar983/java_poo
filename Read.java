import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        /*
         * Leitura de dados
         */
        Scanner reading = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");

        String movie = reading.nextLine();

        System.out.println(movie);

        System.out.println("Qual o ano de lançamento:");

        int ageMovie = reading.nextInt();

        System.out.println(ageMovie);
        /*
         * Scanner, uma entrada de dados
         */

        System.out.println("Informe uma avaliação para esse filme");

        double noteMovie = reading.nextDouble();

        System.out.println(noteMovie);
    }
}
