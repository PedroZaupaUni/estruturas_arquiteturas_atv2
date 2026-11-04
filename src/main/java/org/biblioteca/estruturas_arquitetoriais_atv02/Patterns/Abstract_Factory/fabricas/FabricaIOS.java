package org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.fabricas;

import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.Botao;
import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.Input;
import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.ios.BotaoIOS;
import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.ios.InputIOS;

public class FabricaIOS implements Fabrica {
    @Override
    public Botao criarBotao() {
        return new BotaoIOS();
    }

    @Override
    public Input criarInput() {
        return new InputIOS();
    }
}
