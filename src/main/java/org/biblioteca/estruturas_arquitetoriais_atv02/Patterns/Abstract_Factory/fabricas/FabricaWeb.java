package org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.fabricas;

import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.Botao;
import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.Input;
import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.web.BotaoWeb;
import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.web.InputWeb;

public class FabricaWeb implements Fabrica {
    @Override
    public Botao criarBotao() {
        return new BotaoWeb();
    }

    @Override
    public Input criarInput() {
        return new InputWeb();
    }
}
