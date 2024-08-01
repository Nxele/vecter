package com.vecter.tutorial.springboot.vecter

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hello")
class HelloWorldController {
    @GetMapping("/world")
    fun helloWord(): String {
        return "Hello vecter king welcome to spring boot"
    }

    @GetMapping("/name")
    fun getName(): String {
        return "Nduduzo Sizwe Vecter Boss BMV NXele \uD83D\uDE01"
    }
}
