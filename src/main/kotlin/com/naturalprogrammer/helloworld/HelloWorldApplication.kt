package com.naturalprogrammer.helloworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping

import org.springframework.web.bind.annotation.RestController


@SpringBootApplication
class HelloWorldApplication

fun main(args: Array<String>) {
    runApplication<HelloWorldApplication>(*args)
}

@RestController
class DockerMessageController {
    @GetMapping("/messages")
    fun message()  = "Hello from Docker!"
}