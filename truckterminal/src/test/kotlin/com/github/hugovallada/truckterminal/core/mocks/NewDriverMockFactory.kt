package com.github.hugovallada.truckterminal.core.mocks

import com.github.hugovallada.truckterminal.core.ports.`in`.models.NewDriver

@Suppress("LongParameterList")
object NewDriverMockFactory {
    fun createDriver(
        name: String = "Augusto",
        age: Int = 20,
        gender: String = "MALE",
        hasVehicle: Boolean = true,
        driverLicenseType: String = "B",
        isLoaded: Boolean = true,
        vehicleTypeCode: Int = 1,
        from: Set<String> = setOf("12.94", "62.32"),
        to: Set<String> = setOf("-23.21", "-78.23")
    ) = NewDriver(
        name = name,
        age = age,
        gender = gender,
        hasVehicle = hasVehicle,
        driverLicenseType = driverLicenseType,
        isLoaded = isLoaded,
        vehicleTypeCode = vehicleTypeCode,
        from = from,
        to = to,
    )
}