package com.github.hugovallada.truckterminal.infra.adapters.`in`.controller

import com.github.hugovallada.truckterminal.core.ports.`in`.GetDriversWithItsOwnTruckUseCase
import com.github.hugovallada.truckterminal.infra.adapters.`in`.models.DriversWithOwnTruck
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/drivers/ownTruck")
class GetDriversWithItsOwnTruck(private val getDriversWithItsOwnTruckUseCase: GetDriversWithItsOwnTruckUseCase) {

    @GetMapping
    fun execute(): DriversWithOwnTruck {
        with(getDriversWithItsOwnTruckUseCase.execute()) {
            return DriversWithOwnTruck(size(), this)
        }
    }
}