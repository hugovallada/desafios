package com.github.hugovallada.truckterminal.infra.adapters.out

import com.github.hugovallada.truckterminal.core.ports.`in`.models.Drivers
import com.github.hugovallada.truckterminal.core.ports.out.GetDriversWithItsOwnTruckOutputPort
import com.github.hugovallada.truckterminal.infra.annotations.AdapterComponent
import com.github.hugovallada.truckterminal.infra.db.adapter.DriverEntityAdapter
import com.github.hugovallada.truckterminal.infra.db.repository.DriverRepository
import org.eclipse.collections.api.factory.Lists
import org.jmolecules.architecture.hexagonal.SecondaryAdapter

@SecondaryAdapter
@AdapterComponent
class GetDriversWithItsOwnTruckOutputAdapter(private val driverRepository: DriverRepository) :
    GetDriversWithItsOwnTruckOutputPort {
    override fun execute(): Drivers = Lists.immutable.ofAll(
        driverRepository.findAllByHasVehicle(true)
            .map { DriverEntityAdapter.toDriver(it) }
    )
}