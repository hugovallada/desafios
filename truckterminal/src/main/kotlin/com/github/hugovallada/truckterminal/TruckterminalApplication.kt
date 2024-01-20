package com.github.hugovallada.truckterminal

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
class TruckterminalApplication

fun main(args: Array<String>) {
    runApplication<TruckterminalApplication>(*args)
}
