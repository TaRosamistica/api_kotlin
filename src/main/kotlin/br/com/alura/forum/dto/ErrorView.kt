package br.com.alura.forum.dto

import org.springframework.http.HttpStatus
import java.time.LocalDateTime

data class ErrorView(
        val timestamp: LocalDateTime = LocalDateTime.now(),
        val status: Int,
        val error: String,
        val message: String?,
        val path: String
)


