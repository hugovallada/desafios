package com.github.hugovallada.truckterminal.core.entity

import org.jmolecules.ddd.annotation.ValueObject

@ValueObject
@JvmInline
value class Age(
    val value: Int
) {
    init {
        require(value >= 18) { "The driver can't be younger than 18 years older" }
    }
}