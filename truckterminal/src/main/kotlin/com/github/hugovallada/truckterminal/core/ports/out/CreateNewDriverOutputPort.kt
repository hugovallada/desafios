package com.github.hugovallada.truckterminal.core.ports.out

import com.github.hugovallada.truckterminal.core.ports.out.models.NewDriverOutputModel
import org.jmolecules.architecture.hexagonal.SecondaryPort


@SecondaryPort
fun interface CreateNewDriverOutputPort {
    fun execute(driver: NewDriverOutputModel)
}