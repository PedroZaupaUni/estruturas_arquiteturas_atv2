package org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.android;

import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.Input;

public class InputAndroid implements Input {
    @Override
    public void renderizarInput() {
        System.out.println("Input Android");
    }
}
