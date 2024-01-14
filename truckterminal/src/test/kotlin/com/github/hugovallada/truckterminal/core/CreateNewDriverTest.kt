package com.github.hugovallada.truckterminal.core

import com.github.hugovallada.truckterminal.core.entity.Driver
import com.github.hugovallada.truckterminal.core.mocks.NewDriverMockFactory
import com.github.hugovallada.truckterminal.core.ports.`in`.CreateNewDriverInputPort
import com.github.hugovallada.truckterminal.core.ports.`in`.models.NewDriver
import io.mockk.*
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import jakarta.validation.ConstraintViolation
import jakarta.validation.ConstraintViolationException
import jakarta.validation.Validator
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.extension.ExtendWith


@ExtendWith(MockKExtension::class)
class CreateNewDriverTest {

    @MockK
    private lateinit var createNewDriverInputPort: CreateNewDriverInputPort

    @MockK
    private lateinit var validator: Validator

    @MockK(relaxed = true)
    private lateinit var constraintViolation: ConstraintViolation<Driver>

    @InjectMockKs
    private lateinit var createNewDriver: CreateNewDriver

    @BeforeEach
    fun setUp() = clearAllMocks()

    @Test
    fun `should successfully run and call the create new driver input port`() {
        // Arrange
        val newDriver = NewDriverMockFactory.createDriver()
        every { validator.validate(any<Driver>()) } returns setOf()
        every { createNewDriverInputPort.execute(any<NewDriver>()) } just runs

        // Act
        createNewDriver.execute(newDriver)

        // Assert
        verifySequence {
            validator.validate(any<Driver>())
            createNewDriverInputPort.execute(any<NewDriver>())
        }
    }

    @Test
    fun `should throw a constraint exception when validation fails`() {
        // Arrange
        val newDriver = NewDriverMockFactory.createDriver()
        every {
            validator.validate(any(Driver::class))
        } returns mutableSetOf<ConstraintViolation<Driver>>(constraintViolation)

        // Act
        assertThrows<ConstraintViolationException> {
            createNewDriver.execute(newDriver)
        }

        // Assert
        verify(exactly = 1) {
            validator.validate(any(Driver::class))
        }
        verify(exactly = 0) {
            createNewDriverInputPort.execute(any(NewDriver::class))
        }
    }

}
