package br.edu.catolica.es.fastfood.builder.Interface;

public interface Builder <K, T>{
    K recheio (String recheio);
    K molho (String[] molho);
    K extra (String extra);
    T create ();

}
