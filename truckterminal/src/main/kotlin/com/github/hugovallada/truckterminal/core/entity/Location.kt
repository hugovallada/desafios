package com.github.hugovallada.truckterminal.core.entity

import jakarta.validation.constraints.NotBlank


data class Location(@field:NotBlank val lat: String, @field:NotBlank val long: String) {
    companion object {
        fun of(values: Set<String>): Location {
            require(values.size == 2) {
                "There's more attributes than expected. " +
                        "Location should have only latitude and longitude"
            }
            return Location(values.elementAt(0), values.elementAt(1))
        }
    }
}