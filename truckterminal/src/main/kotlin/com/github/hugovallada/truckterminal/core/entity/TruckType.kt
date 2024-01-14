package com.github.hugovallada.truckterminal.core.entity

@Suppress("MagicNumber")
enum class TruckType(val code: Int) {
    TRUCK_3_4(1),
    WOOD_TRUCK(2),
    TRUCK(3),
    SMALL_TRUCK(4),
    EXTEND_TRUCK(5);

    companion object {
        fun of(code: Int): TruckType {
            return TruckType.entries.find { it.code == code }
                ?: error("Truck Type conde is invalid")
        }
    }
}