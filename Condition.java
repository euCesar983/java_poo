public class Condition {
    public static void main(String[] args) {
        int anoDeLancamento = 2024;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.0;
        String tipoPlano = "Plus";

        /*
         * Estrutura condicional em java
         */
        if (anoDeLancamento == 2024) {
            System.out.println("Lançamento");
        } else {
            System.out.println("Não é um lançamento");
        }

        /*
         * equals, operador para string
         */
        if (incluidoNoPlano || tipoPlano.equals("Plus")) {
            System.out.println("Pode assistir");
        } else {
            System.out.println("Não pode assistir, assine o plano plus");
        }

        if (notaDoFilme > 7.5) {
            System.out.println("O filme tem uma boa avaliação");
        } else {
            System.out.println("O filme recebeu uma pessima avaliação");
        }

    }
}
