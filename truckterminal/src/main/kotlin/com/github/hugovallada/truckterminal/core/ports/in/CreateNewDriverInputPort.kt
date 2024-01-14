package com.github.hugovallada.truckterminal.core.ports.`in`

import com.github.hugovallada.truckterminal.core.ports.`in`.models.NewDriver

fun interface CreateNewDriverInputPort {
    fun execute(driver: NewDriver)
}