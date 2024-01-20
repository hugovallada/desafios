package com.github.hugovallada.truckterminal.core.entity

import jakarta.validation.constraints.NotBlank


data class Location(@field:NotBlank val lat: String, @field:NotBlank val long: String) {
    init {
        require(!lat.contains(",") && !long.contains(",")) {
            "Latitude e Longitude não aceitam ',', use '.' no lugar"
        }
    }

    companion object {
        fun of(values: Set<String>): Location {
            require(values.size == 2) {
                "There's should be 2 attributes. " +
                        "Location should have latitude and longitude"
            }
            return Location(values.elementAt(0), values.elementAt(1))
        }

        fun of(value: String): Location {
            require("," in value) {
                "O valor enviado é inválido, " +
                        "é necessário 2 parametros, para a latitude e longitude"
            }
            val coordinates = value.split(",")
            check(coordinates.size == 2) { "Número inválido de coordenadas" }
            check(coordinates.all { it.isNotEmpty() }) { "As coordenadas não devem estar vazias" }
            return Location(coordinates[0], coordinates[1])
        }
    }
}