package com.github.hugovallada.truckterminal.infra.db.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
@Suppress("LongParameterList")
class DriverEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,
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