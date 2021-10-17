package dev.juliofonsca.rabbitmq.controller;

import dev.juliofonsca.rabbitmq.constants.RabbitMQConstants;
import dev.juliofonsca.rabbitmq.dto.EstoqueDto;
import dev.juliofonsca.rabbitmq.service.RabbitMQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "estoque")
public class EstoqueController {

    @Autowired
    private RabbitMQService rabbitMQService;

    @RequestMapping(method = {RequestMethod.PUT})
    private ResponseEntity alteraEstoque(@RequestBody @Valid EstoqueDto estoqueDto) {
        System.out.println(estoqueDto.codigoProduto);
        this.rabbitMQService.enviamMensagem(RabbitMQConstants.FILA_ESTOQUE, estoqueDto);
        return new ResponseEntity(HttpStatus.OK);
    }
}
