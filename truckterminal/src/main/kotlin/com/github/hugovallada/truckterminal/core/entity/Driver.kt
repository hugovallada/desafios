package com.github.hugovallada.truckterminal.core.entity

import jakarta.validation.Valid
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Positive
import jakarta.validation.constraints.Size

@Suppress("LongParameterList")
class Driver(
    @field:NotBlank(message = "The driver name can't be blank")
    @field:Size(min = 3, message = "The driver name can't be less than 3 characters")
    val name: String,

    @field:Positive(message = "The driver age can't be negative")
    @field:Min(value = 18, message = "The driver can't be younger than 18 years older")
    val age: Int,

    val gender: Gender,

    val hasTruck: Boolean,

    @field:NotBlank(message = "The driver must have a license type")
    val driverLicenseType: String,

    val isLoaded: Boolean,

    val truckType: TruckType,

    @Valid
    val from: Location,

    @Valid
    val to: Location
) {
    override fun toString(): String {
        return "Driver(name='$name', age=$age, gender=$gender, hasTruck=$hasTruck, " +
                "driverLicenseType='$driverLicenseType', isLoaded=$isLoaded, truckType=$truckType, from=$from, to=$to)"
    }
}