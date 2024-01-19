package com.github.hugovallada.truckterminal.core.ports.out

import com.github.hugovallada.truckterminal.core.ports.out.models.NewDriverOutputModel


fun interface CreateNewDriverOutputPort {
    fun execute(driver: NewDriverOutputModel)
}