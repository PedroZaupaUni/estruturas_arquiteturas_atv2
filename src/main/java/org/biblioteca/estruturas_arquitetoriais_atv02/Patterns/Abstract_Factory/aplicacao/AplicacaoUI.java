package org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.aplicacao;


import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.fabricas.Fabrica;
import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.Botao;
import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.Input;

public class AplicacaoUI {
    private final Fabrica fabrica;

    public AplicacaoUI(Fabrica fabrica) {
        this.fabrica = fabrica;
    }

    public void renderizarTela() {
        Botao botao = fabrica.criarBotao();
        Input input = fabrica.criarInput();

        botao.renderizarBotao();
        input.renderizarInput();
    }
}
