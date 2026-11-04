package org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.fabricas;

import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.Botao;
import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.Input;

public interface Fabrica {
    Botao criarBotao();
    Input criarInput();
}
