package com.github.hugovallada.truckterminal.core.ports.out.models

data class NewDriverOutputModel(
    val name: String,
    val age: Int,
    val gender: String,
    val hasVehicle: Boolean,
    val driverLicenseType: String,
    val isLoaded: Boolean,
    val vehicleTypeCode: Int,
    val from: Set<String>,
    val to: Set<String>
)
