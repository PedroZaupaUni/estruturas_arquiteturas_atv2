package org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory;

import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.aplicacao.AplicacaoUI;
import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.fabricas.FabricaAndroid;
import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.fabricas.FabricaIOS;
import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Abstract_Factory.fabricas.FabricaWeb;

public class Main {
    public static void main(String[] args) {
        AplicacaoUI telaAndroid = new AplicacaoUI(new FabricaAndroid());
        telaAndroid.renderizarTela();

        AplicacaoUI telaIOS = new AplicacaoUI(new FabricaIOS());
        telaIOS.renderizarTela();

        AplicacaoUI telaWeb = new AplicacaoUI(new FabricaWeb());
        telaWeb.renderizarTela();
    }
}
