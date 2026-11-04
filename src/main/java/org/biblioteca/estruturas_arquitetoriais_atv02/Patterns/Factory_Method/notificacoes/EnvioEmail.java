package org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Factory_Method.notificacoes;

public class EnvioEmail implements IntNotificacoes {
    @Override
    public void enviar() {
        System.out.println("Envio Email!");
    }
}
