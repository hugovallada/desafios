package com.github.hugovallada.truckterminal.core

import com.github.hugovallada.truckterminal.core.entity.Driver
import com.github.hugovallada.truckterminal.core.entity.factory.DriverFactory
import com.github.hugovallada.truckterminal.core.ports.`in`.CreateNewDriverUseCase
import com.github.hugovallada.truckterminal.core.ports.`in`.models.NewDriver
import jakarta.inject.Singleton
import jakarta.validation.ConstraintViolationException
import jakarta.validation.Validator

@Singleton
class CreateNewDriver(private val validator: Validator) : CreateNewDriverUseCase {

    override fun execute(newDriver: NewDriver) {
        val driver = createAValidDriver(DriverFactory.fromNewDriver(newDriver))
    }

    private fun createAValidDriver(driver: Driver): Driver {
        val constraintViolations = validator.validate(driver)
        if (constraintViolations.isEmpty()) return driver else throw ConstraintViolationException(constraintViolations)
    }

}