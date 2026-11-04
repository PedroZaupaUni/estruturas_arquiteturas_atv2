package org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Factory_Method.fabricas;

import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Factory_Method.notificacoes.IntNotificacoes;

public abstract class NotificadorFactory {
    protected abstract IntNotificacoes criarNotificacao();

    public void notificar() {
        IntNotificacoes notificacao = criarNotificacao();
        notificacao.enviar();
    }
}
