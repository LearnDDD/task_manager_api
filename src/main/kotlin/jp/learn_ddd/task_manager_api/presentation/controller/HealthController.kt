package jp.learn_ddd.task_manager_api.presentation.controller

import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class HealthController {
    @GetMapping
    fun get(): ResponseEntity<Response> {
        val headers = HttpHeaders()
        return try {
            val datasource = System.getenv("DATASOURCE")
            val response = Response("Application Running.", datasource)
            ResponseEntity(response, headers, HttpStatus.OK)
        }catch (e: Exception) {
            val response = Response("Application Failed.", "Unkown")
            ResponseEntity(response, headers, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }
}

data class Response(val state: String, val datasource: String)
