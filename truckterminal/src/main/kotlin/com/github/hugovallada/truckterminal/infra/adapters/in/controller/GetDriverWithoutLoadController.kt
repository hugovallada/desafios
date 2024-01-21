package com.github.hugovallada.truckterminal.infra.adapters.`in`.controller

import com.github.hugovallada.truckterminal.core.ports.`in`.GetDriversWithoutLoadUseCase
import com.github.hugovallada.truckterminal.core.ports.`in`.models.Drivers
import org.jmolecules.architecture.hexagonal.PrimaryAdapter
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/drivers/noLoad")
@PrimaryAdapter
class GetDriverWithoutLoadController(private val getDriversWithoutLoadUseCase: GetDriversWithoutLoadUseCase) {

    @GetMapping
    fun getDriversWithoutLoad(): Drivers {
        return getDriversWithoutLoadUseCase.execute()
    }


}