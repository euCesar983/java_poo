public class ScreenMatch {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao Screen Match");
        System.out.println("Filme: Taxi Driver");

        int anoDeLancamento = 1980;

        System.out.println("Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;

        System.out.println("Incluido no plano? " + incluidoNoPlano);

        double media = (8.0 + 6.0 + 8.0) / 3;
        System.out.println(media);

        String sinopse;

        sinopse = "Filme introspectivo sobre um motorista de taxi, sera ele louco?";
        System.out.println(sinopse);

        String sinopse_2 = """
                Filme: Taxi Driver
                Filme introspectivo, sobre a visão da sociedade americana.
                Muito bom, as pessoas gostaram
                """ + anoDeLancamento;

        System.out.println(sinopse_2);

        /*
         * Ultilizando String, uma classe de caracteres do java
         */

        String password = "102799";

        /*
         * Fazendo uma condição de senha, ultilizando if e else
         */

        if (password.equals("102799")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Acesso negado. Senha incorreta");
        }

        int classificacao;

        /*
         * Casting, conversão de valor
         */

        classificacao = (int) media / 2;
        System.out.println(classificacao);
    }
}
