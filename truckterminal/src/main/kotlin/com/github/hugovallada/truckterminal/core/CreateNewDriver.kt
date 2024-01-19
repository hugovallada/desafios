package com.github.hugovallada.truckterminal.core

import com.github.hugovallada.truckterminal.core.entity.factory.DriverAdapter
import com.github.hugovallada.truckterminal.core.entity.factory.DriverFactory
import com.github.hugovallada.truckterminal.core.ports.`in`.CreateNewDriverInputPort
import com.github.hugovallada.truckterminal.core.ports.`in`.CreateNewDriverUseCase
import com.github.hugovallada.truckterminal.core.ports.`in`.models.NewDriver
import com.github.hugovallada.truckterminal.core.util.validate
import jakarta.inject.Named
import jakarta.validation.Validator

@Named
class CreateNewDriver(
    private val validator: Validator,
    private val createNewDriverInputPort: CreateNewDriverInputPort
) : CreateNewDriverUseCase {


    override fun execute(newDriver: NewDriver) {
        val driver = DriverFactory.fromNewDriver(newDriver).validate(validator)
        createNewDriverInputPort.execute(DriverAdapter.toNewDriver(driver))
    }

}
