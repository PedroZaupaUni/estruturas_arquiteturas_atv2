package org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Factory_Method;

import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Factory_Method.fabricas.NotificadorEmail;
import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Factory_Method.fabricas.NotificadorFactory;
import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Factory_Method.fabricas.NotificadorPush;
import org.biblioteca.estruturas_arquitetoriais_atv02.Patterns.Factory_Method.fabricas.NotificadorSMS;

public class Main {
    public static void main(String[] args) {
        NotificadorFactory notificadorEmail = new NotificadorEmail();
        notificadorEmail.notificar();

        NotificadorFactory notificadorSMS = new NotificadorSMS();
        notificadorSMS.notificar();

        NotificadorFactory notificadorPush = new NotificadorPush();
        notificadorPush.notificar();
    }
}
