package org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.web;

import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.Botao;

public class BotaoWeb implements Botao {
    @Override
    public void renderizarBotao() {
        System.out.println("Botão Web");
    }
}
