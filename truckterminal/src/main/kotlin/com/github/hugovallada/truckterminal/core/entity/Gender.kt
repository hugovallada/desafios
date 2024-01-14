package com.github.hugovallada.truckterminal.core.entity

enum class Gender {
    MALE,
    FEMALE,
    OTHER;

    companion object {
        fun of(value: String): Gender {
            return try {
                Gender.valueOf(value.uppercase())
            } catch (ex: IllegalArgumentException) {
                OTHER
            }
        }
    }
}