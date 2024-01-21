package com.github.hugovallada.truckterminal.infra.adapters.out

import com.github.hugovallada.truckterminal.core.ports.out.GetDriversWithoutLoadOutputPort
import com.github.hugovallada.truckterminal.infra.annotations.AdapterComponent
import com.github.hugovallada.truckterminal.infra.db.adapter.DriverEntityAdapter
import com.github.hugovallada.truckterminal.infra.db.repository.DriverRepository
import org.eclipse.collections.api.factory.Lists
import org.jmolecules.architecture.hexagonal.SecondaryAdapter

@AdapterComponent
@SecondaryAdapter
class GetDriversWithoutLoadOutputAdapter(private val driverRepository: DriverRepository) :
    GetDriversWithoutLoadOutputPort {
    override fun execute() = Lists.immutable
        .ofAll(driverRepository.findAllByIsLoaded(false)
            .map { DriverEntityAdapter.toDriver(it) })

}