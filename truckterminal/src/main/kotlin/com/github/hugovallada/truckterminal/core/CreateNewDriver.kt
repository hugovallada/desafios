package com.github.hugovallada.truckterminal.core

import com.github.hugovallada.truckterminal.core.entity.factory.DriverAdapter
import com.github.hugovallada.truckterminal.core.entity.factory.DriverFactory
import com.github.hugovallada.truckterminal.core.ports.`in`.CreateNewDriverUseCase
import com.github.hugovallada.truckterminal.core.ports.`in`.models.NewDriver
import com.github.hugovallada.truckterminal.core.ports.out.CreateNewDriverOutputPort
import com.github.hugovallada.truckterminal.core.util.validate
import jakarta.inject.Named
import jakarta.validation.Validator
import org.jmolecules.architecture.hexagonal.Application

@Named
@Application
class CreateNewDriver(
    private val validator: Validator,
    private val createNewDriverOutputPort: CreateNewDriverOutputPort
) : CreateNewDriverUseCase {

    override fun execute(newDriver: NewDriver) {
        val driver = DriverFactory.fromNewDriver(newDriver).validate(validator)
        createNewDriverOutputPort.execute(DriverAdapter.toNewDriverOutputModel(driver))
    }


}
