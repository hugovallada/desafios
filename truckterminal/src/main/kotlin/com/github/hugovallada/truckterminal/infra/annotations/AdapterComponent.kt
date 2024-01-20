package com.github.hugovallada.truckterminal.infra.annotations

import org.springframework.stereotype.Component
import org.springframework.stereotype.Indexed

@Target(allowedTargets = [AnnotationTarget.CLASS])
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
@Indexed
@Component
annotation class AdapterComponent
