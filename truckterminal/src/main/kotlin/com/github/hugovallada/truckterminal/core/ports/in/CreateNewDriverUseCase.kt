package com.github.hugovallada.truckterminal.core.ports.`in`

import com.github.hugovallada.truckterminal.core.ports.`in`.models.NewDriver
import org.jmolecules.architecture.hexagonal.PrimaryPort

@PrimaryPort
fun interface CreateNewDriverUseCase {
    fun execute(newDriver: NewDriver)
}