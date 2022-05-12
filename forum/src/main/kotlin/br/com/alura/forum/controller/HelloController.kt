package br.com.alura.forum.controller

import br.com.alura.forum.service.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloController (
        private val helloService: HelloService
) {

    @GetMapping
    fun hello(): String{
        val message = helloService.helloMessege()
        return  message
    }
}