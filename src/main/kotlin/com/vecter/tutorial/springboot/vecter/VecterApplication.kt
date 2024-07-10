package com.vecter.tutorial.springboot.vecter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VecterApplication

fun main(args: Array<String>) {
	runApplication<VecterApplication>(*args)
}
