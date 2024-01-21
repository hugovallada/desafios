package com.github.hugovallada.truckterminal.core.ports.out

import com.github.hugovallada.truckterminal.core.ports.`in`.models.Drivers
import org.jmolecules.architecture.hexagonal.SecondaryPort

@SecondaryPort
fun interface GetDriversWithoutLoadOutputPort {
    fun execute(): Drivers
}