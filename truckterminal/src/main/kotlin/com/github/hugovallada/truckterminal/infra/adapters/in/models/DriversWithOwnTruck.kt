package com.github.hugovallada.truckterminal.infra.adapters.`in`.models

import com.github.hugovallada.truckterminal.core.ports.`in`.models.Drivers

data class DriversWithOwnTruck(
    val count: Int,
    val drivers: Drivers
)