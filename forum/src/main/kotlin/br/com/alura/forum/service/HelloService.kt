package br.com.alura.forum.service

import org.springframework.stereotype.Service

@Service
class HelloService {

    fun helloMessege(): String{
        return "Olá, estou rodando na porta 8080"
    }

}