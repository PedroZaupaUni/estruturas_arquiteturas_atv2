package org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.fabricas;

import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.Botao;
import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.Input;
import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.android.BotaoAndroid;
import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.android.InputAndroid;

public class FabricaAndroid implements Fabrica {
    @Override
    public Botao criarBotao() {
        return new BotaoAndroid();
    }

    @Override
    public Input criarInput() {
        return new InputAndroid();
    }
}
