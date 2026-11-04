package org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.web;

import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.Input;

public class InputWeb implements Input {
    @Override
    public void renderizarInput() {
        System.out.println("Input Web");
    }
}
