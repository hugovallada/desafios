package com.github.hugovallada.truckterminal.core.ports.`in`

import com.github.hugovallada.truckterminal.core.ports.`in`.models.NewDriver

fun interface CreateNewDriverUseCase {
    fun execute(newDriver: NewDriver)
}