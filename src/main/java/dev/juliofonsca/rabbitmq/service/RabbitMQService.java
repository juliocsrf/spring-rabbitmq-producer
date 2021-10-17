package dev.juliofonsca.rabbitmq.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    public void enviamMensagem(String nomeFila, Object message) {
        try {
            String mensagemJson = this.objectMapper.writeValueAsString(message);
            this.rabbitTemplate.convertAndSend(nomeFila, mensagemJson);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
