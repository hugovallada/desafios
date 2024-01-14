package com.github.hugovallada.truckterminal.infra.adapters.`in`.models

import jakarta.validation.constraints.*


data class NewDriverRequest(
    @field:NotBlank(message = "The driver name can't be blank")
    @field:Size(min = 3, message = "The driver name can't be less than 3 characters")
    val name: String,

    @field:Positive(message = "The driver age can't be negative")
    @field:Min(value = 18, message = "The driver can't be younger than 18 years older")
    val age: Int,

    @field:Pattern(regexp = "MALE|FEMALE|OTHER", flags = [Pattern.Flag.CASE_INSENSITIVE])
    val gender: String,

    val hasVehicle: Boolean,

    @field:NotBlank(message = "The driver must have a license type")
    val driverLicenseType: String,

    val isLoaded: Boolean,

    val vehicleTypeCode: Int,

    val from: Set<String>,
    val to: Set<String>
)

