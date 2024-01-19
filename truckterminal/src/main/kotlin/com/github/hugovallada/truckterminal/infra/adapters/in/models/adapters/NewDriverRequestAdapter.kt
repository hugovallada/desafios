package com.github.hugovallada.truckterminal.infra.adapters.`in`.models.adapters

import com.github.hugovallada.truckterminal.core.ports.`in`.models.NewDriver
import com.github.hugovallada.truckterminal.infra.adapters.`in`.models.NewDriverRequest


fun adaptToNewDriver(newDriverRequest: NewDriverRequest): NewDriver {
    return NewDriver(
        name = newDriverRequest.name, age = newDriverRequest.age, gender = newDriverRequest.gender,
        hasVehicle = newDriverRequest.hasVehicle, driverLicenseType = newDriverRequest.driverLicenseType,
        isLoaded = newDriverRequest.isLoaded, vehicleTypeCode = newDriverRequest.vehicleTypeCode,
        from = newDriverRequest.from, to = newDriverRequest.to
    )
}