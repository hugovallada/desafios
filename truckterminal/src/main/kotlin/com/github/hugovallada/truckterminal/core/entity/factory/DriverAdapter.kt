package com.github.hugovallada.truckterminal.core.entity.factory

import com.github.hugovallada.truckterminal.core.entity.Driver
import com.github.hugovallada.truckterminal.core.ports.`in`.models.NewDriver
import com.github.hugovallada.truckterminal.core.ports.out.models.NewDriverOutputModel

object DriverAdapter {

    fun toNewDriver(driver: Driver): NewDriver {
        return NewDriver(
            name = driver.name,
            age = driver.age.value,
            gender = driver.gender.name,
            hasVehicle = driver.hasTruck,
            driverLicenseType = driver.driverLicenseType,
            isLoaded = driver.isLoaded,
            vehicleTypeCode = driver.truckType.code,
            from = setOf(driver.from.lat, driver.from.long),
            to = setOf(driver.to.lat, driver.to.long)
        )
    }

    fun toNewDriverOutputModel(driver: Driver): NewDriverOutputModel {
        return NewDriverOutputModel(
            name = driver.name,
            age = driver.age.value,
            gender = driver.gender.name,
            hasVehicle = driver.hasTruck,
            driverLicenseType = driver.driverLicenseType,
            isLoaded = driver.isLoaded,
            vehicleTypeCode = driver.truckType.code,
            from = setOf(driver.from.lat, driver.from.long),
            to = setOf(driver.to.lat, driver.to.long)
        )
    }
}