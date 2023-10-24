package br.edu.catolica.es.fastfood.builder;

import br.edu.catolica.es.fastfood.builder.Interface.Builder;

public class SanduicheBuilder implements Builder<SanduicheBuilder, Sanduiche> {

    private final String tipodepao;
    private String recheio;
    private String [] molho = new String[2];
    private String extra;


    public SanduicheBuilder(String tipodepao) {
        this.tipodepao = tipodepao;
    }

    @Override
    public SanduicheBuilder recheio(String recheio) {
        this.recheio= recheio;
        return this;
    }

    @Override
    public SanduicheBuilder molho(String[] molho) {
        this.molho =molho;
        return this;
    }

    @Override
    public SanduicheBuilder extra(String extra) {
        this.extra = extra;
        return this;
    }

    @Override
    public Sanduiche create() {
        var sanduíche = new Sanduiche();
        sanduíche.setRecheio(this.recheio);
        sanduíche.setMolho(this.molho);
        sanduíche.setExtra(this.extra);
        sanduíche.setTipodepao(this.tipodepao);
        return sanduíche;
    }
}
