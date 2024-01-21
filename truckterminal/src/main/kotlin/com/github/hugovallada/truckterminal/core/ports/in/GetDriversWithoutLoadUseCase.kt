package com.github.hugovallada.truckterminal.core.ports.`in`

import com.github.hugovallada.truckterminal.core.ports.`in`.models.Drivers
import org.jmolecules.architecture.hexagonal.PrimaryPort

@PrimaryPort
fun interface GetDriversWithoutLoadUseCase {
    fun execute(): Drivers
}