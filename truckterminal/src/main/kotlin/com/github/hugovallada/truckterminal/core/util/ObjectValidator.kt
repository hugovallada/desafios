package com.github.hugovallada.truckterminal.core.util

import jakarta.validation.ConstraintViolationException
import jakarta.validation.Validator


fun <T> T.validate(validator: Validator): T {
    val constraintViolations = validator.validate(this)
    if (constraintViolations.isEmpty()) return this else throw ConstraintViolationException(constraintViolations)
}