package com.github.hugovallada.truckterminal.core

import com.github.hugovallada.truckterminal.core.ports.`in`.GetDriversWithItsOwnTruckUseCase
import com.github.hugovallada.truckterminal.core.ports.`in`.models.Drivers
import com.github.hugovallada.truckterminal.core.ports.out.GetDriversWithItsOwnTruckOutputPort
import jakarta.inject.Named
import org.jmolecules.architecture.hexagonal.Application

@Application
@Named
class GetDriversWithItsOwnTruck(private val getDriversWithItsOwnTruckOutputPort: GetDriversWithItsOwnTruckOutputPort) :
    GetDriversWithItsOwnTruckUseCase {
    override fun execute(): Drivers {
        return getDriversWithItsOwnTruckOutputPort.execute()
    }
}