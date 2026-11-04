package org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.ios;

import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.Botao;

public class BotaoIOS implements Botao {
    @Override
    public void renderizarBotao() {
        System.out.println("Botão IOS");
    }
}
