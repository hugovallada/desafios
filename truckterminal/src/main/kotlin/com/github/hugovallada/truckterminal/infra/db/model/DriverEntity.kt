package com.github.hugovallada.truckterminal.infra.db.model

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Suppress("LongParameterList")
class DriverEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val name: String,
    val age: Int,
    val gender: String,
    val hasVehicle: Boolean,
    val driverLicenseType: String,
    val isLoaded: Boolean,
    val vehicleTypeCode: Int,
    @Column(name = "tb_from")
    val from: String,
    @Column(name = "tb_to")
    val to: String,
    val date: LocalDate = LocalDate.now()
)