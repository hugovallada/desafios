package com.github.hugovallada.truckterminal.infra.db.adapter

import com.github.hugovallada.truckterminal.core.ports.out.models.Driver
import com.github.hugovallada.truckterminal.core.ports.out.models.NewDriverOutputModel
import com.github.hugovallada.truckterminal.infra.db.model.DriverEntity

object DriverEntityAdapter {
    fun fromNewDriverOutputModel(driver: NewDriverOutputModel): DriverEntity {
        return DriverEntity(
            name = driver.name,
            age = driver.age,
            gender = driver.gender,
            hasVehicle = driver.hasVehicle,
            driverLicenseType = driver.driverLicenseType,
            isLoaded = driver.isLoaded,
            vehicleTypeCode = driver.vehicleTypeCode,
            from = driver.from.joinToString(","),
            to = driver.to.joinToString(",")
        )
    }

    fun toDriver(driverEntity: DriverEntity): Driver {
        return Driver(
            name = driverEntity.name, age = driverEntity.age, gender = driverEntity.gender,
            hasVehicle = driverEntity.hasVehicle, driverLicenseType = driverEntity.driverLicenseType,
            isLoaded = driverEntity.isLoaded, vehicleTypeCode = driverEntity.vehicleTypeCode,
            from = driverEntity.from.split(",").toSet(),
            to = driverEntity.from.split(",").toSet(),
            date = driverEntity.date
        )
    }
}