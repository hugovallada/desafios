package com.github.hugovallada.truckterminal.infra.db.repository

import com.github.hugovallada.truckterminal.infra.db.model.DriverEntity
import org.jmolecules.ddd.annotation.Repository
import org.springframework.data.jpa.repository.JpaRepository

@Repository
interface DriverRepository : JpaRepository<DriverEntity, Long> {

    fun findAllByIsLoaded(isLoaded: Boolean): List<DriverEntity>

    fun findAllByHasVehicle(hasVehicle: Boolean): List<DriverEntity>

}