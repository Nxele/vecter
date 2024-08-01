package com.vecter.tutorial.springboot.vecter

import com.vecter.tutorial.springboot.vecter.dataSource.mock.mockBankDataSource
import com.vecter.tutorial.springboot.vecter.model.Bank
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/banks")
class HelloWorldController {
    @GetMapping("/world")
    fun helloWord(): String {
        return "Hello vecter king welcome to spring boot"
    }

    @GetMapping("/name")
    fun getName(): String {
        return "Nduduzo Sizwe Vecter Boss BMV NXele \uD83D\uDE01"
    }

    @GetMapping("/banker")
    fun getBanker() : Collection<Bank> = mockBankDataSource().retrieveBanks()
}
