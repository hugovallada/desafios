package com.github.hugovallada.truckterminal.core.entity.factory

import com.github.hugovallada.truckterminal.core.entity.Driver
import com.github.hugovallada.truckterminal.core.entity.Gender
import com.github.hugovallada.truckterminal.core.entity.Location
import com.github.hugovallada.truckterminal.core.entity.TruckType
import com.github.hugovallada.truckterminal.core.ports.`in`.models.NewDriver

object DriverFactory {
    fun fromNewDriver(newDriver: NewDriver): Driver {
        return Driver(
            name = newDriver.name,
            age = newDriver.age,
            gender = Gender.of(newDriver.gender),
            hasTruck = newDriver.hasVehicle,
            driverLicenseType = newDriver.driverLicenseType,
            isLoaded = newDriver.isLoaded,
            truckType = TruckType.of(newDriver.vehicleTypeCode),
            from = Location.of(newDriver.from),
            to = Location.of(newDriver.to)
        )
    }
}