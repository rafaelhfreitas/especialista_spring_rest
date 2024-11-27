package com.algaworks.algafood;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

    private AtivacaoClienteService ativacaoClienteService;

    public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService){
        this.ativacaoClienteService = ativacaoClienteService;

        System.out.println("MeuPrimeiroControlller: " + ativacaoClienteService);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){

        Cliente cliente = new Cliente("Rafael", "rafael@teste.com", "34999995555");
        ativacaoClienteService.ativar(cliente);
        return "Hello  Rafael!";
    }
}
