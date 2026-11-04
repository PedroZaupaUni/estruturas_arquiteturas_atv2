package org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.android;

import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.Botao;

public class BotaoAndroid implements Botao {
    @Override
    public void renderizarBotao() {
        System.out.println("Botão Android");
    }
}
