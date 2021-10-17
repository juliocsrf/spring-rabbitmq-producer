package dev.juliofonsca.rabbitmq.controller;

import dev.juliofonsca.rabbitmq.constants.RabbitMQConstants;
import dev.juliofonsca.rabbitmq.dto.PrecoDto;
import dev.juliofonsca.rabbitmq.service.RabbitMQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "preco")
public class PrecoController {

    @Autowired
    private RabbitMQService rabbitMQService;

    @PutMapping
    private ResponseEntity alteraPreco(@RequestBody PrecoDto precoDto) {
        System.out.println(precoDto.codigoProduto);
        this.rabbitMQService.enviamMensagem(RabbitMQConstants.FILA_PRECO, precoDto);
        return new ResponseEntity(HttpStatus.OK);
    }
}
