package com.spring.training

import com.spring.training.service.ConsumingService
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class ConsumingYmlApplication

fun main(args: Array<String>) {
    runApplication<ConsumingYmlApplication>(*args)
}



