package dev.juliofonsca.rabbitmq.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void enviamMensagem(String nomeFila, Object message) {
        this.rabbitTemplate.convertAndSend(nomeFila, message);
    }
}
