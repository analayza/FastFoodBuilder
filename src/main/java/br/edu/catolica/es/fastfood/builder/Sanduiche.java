package br.edu.catolica.es.fastfood.builder;


import lombok.Data;

@Data
public class Sanduiche {
    private String tipodepao;
    private String recheio;
    private String [] molho = new String[2];
    private String extra;
}
