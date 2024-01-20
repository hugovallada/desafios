package com.github.hugovallada.truckterminal.infra.db.adapter

import com.github.hugovallada.truckterminal.core.ports.out.models.NewDriverOutputModel
import com.github.hugovallada.truckterminal.infra.db.model.DriverEntity

object DriverEntityAdapter {
    fun fromNewDriverOutputModel(driver: NewDriverOutputModel): DriverEntity {
        return DriverEntity(
            name = driver.name, age = driver.age, gender = driver.gender, hasVehicle = driver.hasVehicle,
            driverLicenseType = driver.driverLicenseType, isLoaded = driver.isLoaded,
            vehicleTypeCode = driver.vehicleTypeCode, from = driver.from, to = driver.to
        )
    }
}