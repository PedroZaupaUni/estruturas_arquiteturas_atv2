package org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Factory_Method.fabricas;

import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Factory_Method.notificacoes.EnvioEmail;
import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Factory_Method.notificacoes.IntNotificacoes;

public class NotificadorEmail extends NotificadorFactory {
    @Override
    protected IntNotificacoes criarNotificacao() {
        return new EnvioEmail();
    }
}
