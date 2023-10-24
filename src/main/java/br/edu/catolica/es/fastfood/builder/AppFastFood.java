package br.edu.catolica.es.fastfood.builder;

public class AppFastFood {
    public static void main(String[] args) {
        var sanduiche = new SanduicheBuilder("Frances")
                .molho(new String[]{"Maionese", "Ketchup"})
                .recheio("Frango") .create();

        var sanduiche2 = new SanduicheBuilder("Frances")
                .molho(new String[]{"Maionese", "Mostarrda"})
                .extra("bacon") .create();

        System.out.println(sanduiche);
    }
}
