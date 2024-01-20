package com.github.hugovallada.truckterminal.infra.adapters.out

import com.github.hugovallada.truckterminal.core.ports.out.CreateNewDriverOutputPort
import com.github.hugovallada.truckterminal.core.ports.out.models.NewDriverOutputModel
import com.github.hugovallada.truckterminal.infra.annotations.AdapterComponent
import com.github.hugovallada.truckterminal.infra.db.adapter.DriverEntityAdapter
import com.github.hugovallada.truckterminal.infra.db.repository.DriverRepository
import jakarta.transaction.Transactional
import org.jmolecules.architecture.hexagonal.SecondaryAdapter

@AdapterComponent
@SecondaryAdapter
class CreateNewDriverOutputAdapter(private val repository: DriverRepository) : CreateNewDriverOutputPort {

    @Transactional
    override fun execute(driver: NewDriverOutputModel) {
        repository.save(DriverEntityAdapter.fromNewDriverOutputModel(driver))
    }

}