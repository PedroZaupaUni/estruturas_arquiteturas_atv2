package org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.ios;

import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.produtos.Input;

public class InputIOS implements Input {
    @Override
    public void renderizarInput() {
        System.out.println("Input IOS");
    }
}
