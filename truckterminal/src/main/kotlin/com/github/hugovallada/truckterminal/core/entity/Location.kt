package com.github.hugovallada.truckterminal.core.entity

import jakarta.validation.constraints.NotBlank


data class Location(@field:NotBlank val lat: String, @field:NotBlank val long: String) {
    companion object {
        fun of(values: Set<String>): Location {
            require(values.size == 2) {
                "There's should be 2 attributes. " +
                        "Location should have latitude and longitude"
            }
            return Location(values.elementAt(0), values.elementAt(1))
        }
    }
}