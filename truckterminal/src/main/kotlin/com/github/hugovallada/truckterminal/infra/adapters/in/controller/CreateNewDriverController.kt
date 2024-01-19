package com.github.hugovallada.truckterminal.infra.adapters.`in`.controller

import com.github.hugovallada.truckterminal.core.ports.`in`.CreateNewDriverUseCase
import com.github.hugovallada.truckterminal.infra.adapters.`in`.models.NewDriverRequest
import com.github.hugovallada.truckterminal.infra.adapters.`in`.models.adapters.adaptToNewDriver
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/trucks")
class CreateNewDriverController(private val createNewDriver: CreateNewDriverUseCase) {

    @PostMapping
    fun execute(@RequestBody @Valid newDriverRequest: NewDriverRequest) {
        val newDriver = adaptToNewDriver(newDriverRequest)
        createNewDriver.execute(newDriver)
    }

}