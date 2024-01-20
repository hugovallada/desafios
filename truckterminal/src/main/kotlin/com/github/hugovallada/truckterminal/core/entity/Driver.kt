package com.github.hugovallada.truckterminal.core.entity

import jakarta.validation.Valid
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import org.jmolecules.ddd.annotation.Entity

@Suppress("LongParameterList")
@Entity
class Driver(
    @field:NotBlank(message = "The driver name can't be blank")
    @field:Size(min = 3, message = "The driver name can't be less than 3 characters")
    val name: String,

    @field:Valid
    val age: Age,

    val gender: Gender,

    val hasTruck: Boolean,

    @field:NotBlank(message = "The driver must have a license type")
    val driverLicenseType: String,

    val isLoaded: Boolean,

    val truckType: TruckType,

    @field:Valid
    val from: Location,

    @field:Valid
    val to: Location
) {
    override fun toString(): String {
        return "Driver(name='$name', age=${age.value}, gender=$gender, hasTruck=$hasTruck, " +
                "driverLicenseType='$driverLicenseType', isLoaded=$isLoaded, truckType=$truckType, from=$from, to=$to)"
    }
}