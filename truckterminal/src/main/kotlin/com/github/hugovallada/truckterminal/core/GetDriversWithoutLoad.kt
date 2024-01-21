package com.github.hugovallada.truckterminal.core

import com.github.hugovallada.truckterminal.core.ports.`in`.GetDriversWithoutLoadUseCase
import com.github.hugovallada.truckterminal.core.ports.`in`.models.Drivers
import com.github.hugovallada.truckterminal.core.ports.out.GetDriversWithoutLoadOutputPort
import jakarta.inject.Named
import org.jmolecules.architecture.hexagonal.Application

@Named
@Application
class GetDriversWithoutLoad(private val getDriversWithoutLoadOutputPort: GetDriversWithoutLoadOutputPort) :
    GetDriversWithoutLoadUseCase {
    override fun execute(): Drivers {
        return getDriversWithoutLoadOutputPort.execute()
    }
}