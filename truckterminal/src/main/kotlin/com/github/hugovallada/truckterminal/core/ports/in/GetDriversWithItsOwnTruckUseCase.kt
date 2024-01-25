package com.github.hugovallada.truckterminal.core.ports.`in`

import com.github.hugovallada.truckterminal.core.ports.`in`.models.Drivers
import org.jmolecules.architecture.hexagonal.PrimaryPort

@PrimaryPort
interface GetDriversWithItsOwnTruckUseCase {
    fun execute(): Drivers
}